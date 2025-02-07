package com.gm.service;

import com.gm.dao.AddressDao;
import com.gm.domain.Address;

import java.util.List;

public class AddressService {
    private AddressDao addressDao;

    public AddressService() {
        this.addressDao = new AddressDao();
    }

    public List<Address> listAddresses() {
        return this.addressDao.listAddresses();
    }

    public Address findAddressById(Address address) {
        return this.addressDao.findAddressById(address);
    }

    public void saveAddress(Address address) {
        if (address != null && address.getIdAddress() == null)
            addressDao.insert(address);
        else
            addressDao.update(address);
    }

    public void deleteAddress(Address address) {
        addressDao.delete(address);
    }
}
