package com.gm.domain;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "contact", schema = "jpa_students_db")
public class Contact implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contact")
    private Integer idContact;

    private String phone;

    private String email;

    public Contact() { }

    public Contact(Integer idContact) {
        this.idContact = idContact;
    }

    public Integer getIdContact() {
        return idContact;
    }

    public void setIdContact(Integer idContact) {
        this.idContact = idContact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;
        return getIdContact().equals(contact.getIdContact());
    }

    @Override
    public int hashCode() {
        return getIdContact().hashCode();
    }

    @Override
    public String toString() {
        return "Contact{" +
                "idContact=" + idContact +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
