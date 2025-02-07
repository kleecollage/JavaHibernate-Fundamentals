package com.gm.service;

import com.gm.dao.AddressDao;
import com.gm.domain.Address;

import java.util.List;

public class AddressService {
    private AddressDao addressDao;

    public AddressService(AddressDao addressDao) {
        this.addressDao = addressDao;
    }

    public List<Address> listAddresses() {
        return this.addressDao.listAddresses();
    }
}
