package com.gm.test;

import com.gm.domain.Address;
import com.gm.domain.Contact;
import com.gm.domain.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestCascadePersistence {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager em = emf.createEntityManager();

        Address address = new Address();
        address.setStreet("Edison Scott Av.");
        address.setNoStreet("545");
        address.setCountry("Germany");

        Contact contact = new Contact();
        contact.setEmail("e.willis@mail.com");
        contact.setPhone("01 55 11 36 47");

        Student student = new Student();
        student.setName("Emily");
        student.setSurname("Willis");
        student.setAddress(address);
        student.setContact(contact);

        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();

        System.out.println("student = " + student);
    }
}
