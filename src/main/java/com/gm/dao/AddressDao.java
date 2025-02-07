package com.gm.dao;

import com.gm.domain.Address;
import jakarta.persistence.*;

import java.util.List;

public class AddressDao {
    // @PersistenceContext(unitName = "HibernatePU")
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
    EntityManager em = emf.createEntityManager();

    public List<Address> listAddresses() {
        String hql = "SELECT a FROM Address a";
        Query query = em.createQuery(hql);
        List<Address> addresses = query.getResultList();
        return addresses;
    }

    public void insert(Address address) {
        try {
            em.getTransaction().begin();
            em.persist(address);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        }
    }

    public void update(Address address) {
        try {
            em.getTransaction().begin();
            em.merge(address);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        }
    }

    public void delete(Address address) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(address));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        }
    }


}
