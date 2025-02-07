package com.gm.dao;

import com.gm.domain.Contact;
import jakarta.persistence.*;

import java.util.List;

public class ContactDao extends GenericDao{

    public List<Contact> listContacts() {
        em = getEntityManager();
        String hql = "SELECT c FROM Contact c";
        Query query = em.createQuery(hql);
        return query.getResultList();
    }

    public Contact getContactById(Contact contact) {
        em = getEntityManager();
        return em.find(Contact.class, contact.getIdContact());
    }

    public void insert(Contact contact) {
        try {
            em = getEntityManager();
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
            em = getEntityManager();
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
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(contact));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        }
    }
}
