package com.web.domain;

import jakarta.persistence.Column;
import jakarta.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Column(name = "id_person")
    @Id
    private int idPerson;

    private String name;
    private String surname;
    private String email;
    private String phone;
}
