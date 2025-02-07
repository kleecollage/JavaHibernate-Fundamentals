package com.gm.web;

import com.gm.domain.Address;
import com.gm.domain.Contact;
import com.gm.domain.Student;
import com.gm.service.StudentService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletUpdate", urlPatterns = "/ServletUpdate")
public class ServletUpdate extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idStudentS = request.getParameter("idStudent");
        Integer idStudent = Integer.parseInt(idStudentS);

        Student student = new Student();
        student.setIdStudent(idStudent);

        StudentService studentService = new StudentService();
        student = studentService.getStudentById(student);

        // request.setAttribute("student", student);
        HttpSession session = request.getSession();
        session.setAttribute("student", student);

        request.getRequestDispatcher("/WEB-INF/updateStudent.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String street = request.getParameter("street");
        String noStreet = request.getParameter("noStreet");
        String country = request.getParameter("country");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");


        HttpSession session = request.getSession();
        Student student = (Student) session.getAttribute("student");

        student.setName(name);
        student.setSurname(surname);
        // Address //
        student.getAddress().setStreet(street);
        student.getAddress().setNoStreet(noStreet);
        student.getAddress().setCountry(country);
        // Contact //
        student.getContact().setEmail(email);
        student.getContact().setPhone(phone);

        StudentService studentService = new StudentService();
        studentService.saveStudent(student);

        session.removeAttribute("student");

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
