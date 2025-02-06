package com.web.test;

import com.web.dao.PersonDao;
import com.web.domain.Person;

public class OperationsHibernateJpa {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        personDao.list();

        Person person = new Person();
        person.setIdPerson(3);
        person = personDao.findPersonById(person);
        System.out.println("Person found: " + person);

        // person.setName("James");
        // person.setSurname("Wilson");
        // person.setEmail("j.wilson@mail.com");
        // person.setPhone("01 13 94 11 55");

        // personDao.insert(person);
        // personDao.update(person);
        personDao.delete(person);
    }
}
