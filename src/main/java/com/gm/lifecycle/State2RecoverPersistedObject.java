package com.gm.lifecycle;

import com.gm.domain.Contact;
import jakarta.persistence.*;

public class State2RecoverPersistedObject {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager em = emf.createEntityManager();

        // DEFINE THE VARIABLE
        Contact contact = null;
        em.getTransaction().begin();

        // RECOVER THE OBJECT
        contact = em.find(Contact.class, 1);
        em.getTransaction().commit();

        // DETACHED
        System.out.println("contact = " + contact);
    }
}
