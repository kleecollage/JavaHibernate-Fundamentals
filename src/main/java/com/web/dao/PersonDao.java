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

    public List<Person> list() {
        String hql = "SELECT p FROM Person p";
        Query query = em.createQuery(hql);
        List<Person> persons = query.getResultList();

        // for (Person person : persons) {
        //   System.out.println("Person: " + person);
        // }
        return persons;
    }

    public void insert(Person person) {
        try {
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        } finally {
            if (em != null) em.close();
        }
    }

    public void update(Person person) {
        try {
            em.getTransaction().begin();
            em.merge(person);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        } finally {
            if (em != null) em.close();
        }
    }

    public void delete(Person person) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(person));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        } finally {
            if (em != null) em.close();
        }
    }

    public Person findPersonById(Person p) {
        return em.find(Person.class, p.getIdPerson());
    }
}
