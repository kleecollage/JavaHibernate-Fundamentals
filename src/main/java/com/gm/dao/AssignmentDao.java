package com.gm.dao;

import com.gm.domain.Assignment;
import jakarta.persistence.*;

import java.util.List;

public class AssignmentDao {
    // @PersistenceContext(unitName = "HibernatePU")
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
    EntityManager em = emf.createEntityManager();

    public List<Assignment> listAssignments() {
        String hql = "SELECT a FROM Assignment a";
        Query query = em.createQuery(hql);
        List<Assignment> assignments = query.getResultList();
        return assignments;
    }

    public Assignment findAssignmentById(Assignment assignment) {
        return em.find(Assignment.class, assignment.getIdAssignment());
    }

    public void insert(Assignment assignment) {
        try {
            em.getTransaction().begin();
            em.persist(assignment);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        }
    }

    public void update(Assignment assignment) {
        try {
            em.getTransaction().begin();
            em.merge(assignment);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        }
    }

    public void delete(Assignment assignment) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(assignment));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        }
    }
}
