package com.web.test;

import com.web.dao.PersonDao;

public class OperationsHibernateJpa {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        personDao.list();
    }
}
