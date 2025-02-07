package com.gm.domain;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "assignment", schema = "jpa_students_db")
public class Assignment implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_assingment")
    private Integer idAssignment;

    @ManyToOne
    @JoinColumn(name = "id_stundent", referencedColumnName = "id_student")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "id_course", referencedColumnName = "id_course")
    private Course course;

    private String shift;

    public Assignment() { }

    public Assignment(Integer idAssignment) {
        this.idAssignment = idAssignment;
    }

    public Integer getIdAssignment() {
        return idAssignment;
    }

    public void setIdAssignment(Integer idAssignment) {
        this.idAssignment = idAssignment;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }



    @Override
    public String toString() {
        return "Assignment{" +
                "idAssignment=" + idAssignment +
                ", student=" + student +
                ", course=" + course +
                ", shift='" + shift + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Assignment that = (Assignment) o;
        return Objects.equals(getIdAssignment(), that.getIdAssignment());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getIdAssignment());
    }
}
