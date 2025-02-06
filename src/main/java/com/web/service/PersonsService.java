package com.web.service;

import com.web.dao.PersonDao;
import com.web.domain.Person;

import java.util.List;

public class PersonsService {
    private PersonDao personDao;

    public PersonsService() {
        this.personDao = new PersonDao();
    }

    public List<Person> listPersons() {
        return this.personDao.list();
    }
}
