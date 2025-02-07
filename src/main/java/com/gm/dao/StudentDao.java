package com.gm.dao;

import com.gm.domain.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class StudentDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.gm");
    EntityManager em = emf.createEntityManager();

    public List<Student> listStudents() {
        String hql = "SELECT s FROM Student s";
        Query query = em.createQuery(hql);
        List<Student> students = query.getResultList();
        return students;
    }

    public Student getStudentById(Student student) {
        return em.find(Student.class, student.getIdStudent());
    }

    public void insert(Student student) {
        try {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        }
    }

    public void update(Student student) {
        try {
            em.getTransaction().begin();
            em.merge(student);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        }
    }

    public void delete(Student student) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(student));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
        }
    }
}
