package com.gm.service;

import com.gm.dao.ContactDao;
import com.gm.domain.Contact;

import java.util.List;

public class ContactService {
    private ContactDao contactDao;

    public ContactService() {
        this.contactDao = new ContactDao();
    }

    public List<Contact> listContacts() {
        return contactDao.listContacts();
    }

    public Contact getContactById(Contact contact) {
        return contactDao.getContactById(contact);
    }

    public void saveContact(Contact contact) {
        if (contact != null && contact.getIdContact() == null)
            contactDao.insert(contact);
        else
            contactDao.update(contact);
    }

    public void deleteContact(Contact contact) {
        contactDao.delete(contact);
    }
}
