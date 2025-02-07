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

    public Course getCourseById(Course course) {
        return courseDao.getCourseById(course);
    }

    public void saveCourse(Course course) {
        if (course != null && course.getIdCourse() == null)
            courseDao.insert(course);
        else
            courseDao.update(course);
    }

    public void deleteCourse(Course course) {
        courseDao.delete(course);
    }
}
