package com.web.dao;

import com.web.domain.Person;
import jakarta.persistence.*;

import java.util.List;

public class PersonDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
    EntityManager em = emf.createEntityManager();

    public PersonDao() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }

    public void list() {
        String hql = "SELECT p FROM Person p";
        Query query = em.createQuery(hql);
        List<Person> persons = query.getResultList();

        for (Person person : persons) {
            System.out.println("Person: " + person);
        }
    }
}
