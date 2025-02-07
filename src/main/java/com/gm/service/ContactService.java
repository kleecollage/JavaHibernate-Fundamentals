package com.gm.service;

import com.gm.dao.ContactDao;
import com.gm.domain.Contact;

import java.util.List;

public class ContactService {
    private ContactDao contactDao;

    public ContactService(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    public List<Contact> listContacts() {
        return contactDao.listContacts();
    }
}
