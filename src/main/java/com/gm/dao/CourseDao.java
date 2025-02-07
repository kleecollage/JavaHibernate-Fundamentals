package com.gm.dao;

import com.gm.domain.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class CourseDao extends GenericDao{

    public List<Course> listCourses() {
        em = getEntityManager();
        String hql = "SELECT c FROM Course c";
        Query query = em.createQuery(hql);
        return query.getResultList();
    }

    public Course getCourseById(Course course) {
        em = getEntityManager();
        return em.find(Course.class, course.getIdCourse());
    }

    public void insert(Course course) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(course);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        }
    }

    public void update(Course course) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(course);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        }
    }

    public void delete(Course course) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(course));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        }
    }
}
