package com.gm.web;

import com.gm.domain.Student;
import com.gm.service.StudentService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentController", urlPatterns = "/StudentController")
public class StudentServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        StudentService studentService = new StudentService();
        List<Student> students = studentService.listStudents();
        request.setAttribute("students", students);

        try {
            request.getRequestDispatcher("WEB-INF/listStudents.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
