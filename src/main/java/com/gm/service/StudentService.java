package com.gm.service;

import com.gm.dao.StudentDao;
import com.gm.domain.Student;

import java.util.List;

public class StudentService {

    private StudentDao studentDao;

    public StudentService() {
        this.studentDao = studentDao;
    }

    public List<Student> listStudents() {
        return studentDao.listStudents();
    }
}
