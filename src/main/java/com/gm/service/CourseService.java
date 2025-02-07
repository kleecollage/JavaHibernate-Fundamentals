package com.gm.service;

import com.gm.dao.CourseDao;
import com.gm.domain.Course;

import java.util.List;

public class CourseService {

    private CourseDao courseDao;

    public CourseService() {
        this.courseDao = new CourseDao();
    }

    public List<Course> listCourses() {
        return courseDao.listCourses();
    }
}
