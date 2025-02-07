package com.gm.domain;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "course", schema = "jpa_students_db")
public class Course implements Serializable {
    
    @Serial
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_course")
    private Integer idCourse;

    private String name;

    private Double price;

    @OneToMany(mappedBy = "course")
    private List<Assignment> assignments;

    public Course() { }

    public Course(Integer idCourse) {
        this.idCourse = idCourse;
    }

    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Integer idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;
        return getIdCourse().equals(course.getIdCourse());
    }

    @Override
    public int hashCode() {
        return getIdCourse().hashCode();
    }

    @Override
    public String toString() {
        return "Course{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", idCourse=" + idCourse +
                '}';
    }
}
