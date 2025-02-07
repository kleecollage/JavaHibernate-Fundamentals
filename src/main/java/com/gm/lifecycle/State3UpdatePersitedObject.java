package com.gm.lifecycle;

import com.gm.domain.Contact;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class State3UpdatePersitedObject {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager em = emf.createEntityManager();

        // DEFINE THE VARIABLE
        Contact contact = null;

        // 1. DETACHED STATE
        contact = em.find(Contact.class, 1);
        // UPDATE THE OBJECT
        contact.setEmail("j.doe@mail.com");

        em.getTransaction().begin();

        // 2. PERSISTENT STATE
        em.merge(contact);
        em.getTransaction().commit();

        // 3. DETACHED
        System.out.println("contact = " + contact);
    }
}
