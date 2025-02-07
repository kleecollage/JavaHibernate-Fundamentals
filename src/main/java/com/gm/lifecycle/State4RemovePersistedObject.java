package com.gm.lifecycle;

import com.gm.domain.Contact;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class State4RemovePersistedObject {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager em = emf.createEntityManager();

        // DEFINE THE VARIABLE
        Contact contact = null;

        // 1. DETACHED STATE
        contact = em.find(Contact.class, 4);

        em.getTransaction().begin();

        // 2. REMOVE
        em.remove(em.merge(contact));
        em.getTransaction().commit();

        // 3. TRANSITIVE STATE
        System.out.println("contact = " + contact);
    }
}
