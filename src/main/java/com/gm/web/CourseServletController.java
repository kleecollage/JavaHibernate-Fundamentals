package com.gm.web;

import com.gm.domain.Course;
import com.gm.service.CourseService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CourseController", urlPatterns = "/CourseController")
public class CourseServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        CourseService courseService = new CourseService();
        List<Course> courses = courseService.listCourses();
        request.setAttribute("courses", courses);
        request.getRequestDispatcher("WEB-INF/listCourses.jsp").forward(request, response);
    }
}
