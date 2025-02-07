package com.gm.dao;

import com.gm.domain.Address;
import jakarta.persistence.*;

import java.util.List;

public class AddressDao extends GenericDao {

    public List<Address> listAddresses() {
        String hql = "SELECT a FROM Address a";
        em = getEntityManager();
        Query query = em.createQuery(hql);
        return query.getResultList();
    }

    public Object findAddressById(Address address) {
        em = getEntityManager();
        return em.find(Address.class, address.getIdAddress());
    }

    public void insert(Address address) {
        try {
            em = getEntityManager();
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
            em = getEntityManager();
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
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(address));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        }
    }


}
