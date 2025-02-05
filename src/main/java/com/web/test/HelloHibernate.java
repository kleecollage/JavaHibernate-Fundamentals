package com.web.test;

import com.web.domain.Person;
import jakarta.persistence.*;

import java.util.List;

public class HelloHibernate {
    public static void main(String[] args) {
        // hql = hibernate query language
        String hql = "SELECT p FROM Person p";
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HelloHibernate");
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery(hql);
        List<Person> persons = query.getResultList();

        for (Person person : persons) {
            System.out.println("Person: " + person);
        }
    }
}
