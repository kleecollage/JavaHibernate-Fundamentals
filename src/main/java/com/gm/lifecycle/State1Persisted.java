package com.gm.lifecycle;

import com.gm.domain.Contact;
import jakarta.persistence.*;

public class State1Persisted {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager em = emf.createEntityManager();

        // 1. TRANSITIVE STATE
        Contact contact = new Contact();
        contact.setEmail("e.willys@mail.com");
        contact.setPhone("01 51 33 48 77");

        // 2. PERSISTENT STATE
        em.getTransaction().begin();
        em.persist(contact);
        // em.flush() // Sync pending data with DB
        em.getTransaction().commit();

        // 3. DETACHED
        System.out.println("contact = " + contact);
    }
}
