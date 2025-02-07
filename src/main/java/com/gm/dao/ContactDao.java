package com.gm.dao;

import com.gm.domain.Contact;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class ContactDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("contactPU");
    EntityManager em = emf.createEntityManager();

    public List<Contact> listContacts() {
        String hql = "SELECT c FROM Contact c";
        Query query = em.createQuery(hql);
        List<Contact> contacts = query.getResultList();
        return contacts;
    }

    public Contact getContactById(Contact contact) {
        return em.find(Contact.class, contact.getIdContact());
    }

    public void insert(Contact contact) {
        try {
            em.getTransaction().begin();
            em.persist(contact);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        }
    }

    public void update(Contact contact) {
        try {
            em.getTransaction().begin();
            em.merge(contact);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        }
    }

    public void delete(Contact contact) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(contact));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        }
    }
}
