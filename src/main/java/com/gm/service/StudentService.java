package com.gm.service;

import com.gm.dao.StudentDao;
import com.gm.domain.Student;

import java.util.List;

public class StudentService {

    private StudentDao studentDao;

    public StudentService() {
        this.studentDao = new StudentDao();
    }

    public List<Student> listStudents() {
        return studentDao.listStudents();
    }

    public Student getStudentById(Student student) {
        return studentDao.getStudentById(student);
    }

    public void saveStudent(Student student) {
        if (student != null && student.getIdStudent() == null)
            studentDao.insert(student);
        else
            studentDao.update(student);
    }

    public void deleteStudent(Student student) {
        studentDao.delete(student);
    }
}
