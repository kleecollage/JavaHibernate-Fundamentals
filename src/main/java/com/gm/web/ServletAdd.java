package com.gm.web;

import com.gm.domain.Address;
import com.gm.domain.Contact;
import com.gm.domain.Student;
import com.gm.service.StudentService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletAdd", urlPatterns = "/ServletAdd")
public class ServletAdd extends HttpServlet {

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

        Address address = new Address();
        address.setStreet(street);
        address.setNoStreet(noStreet);
        address.setCountry(country);

        Contact contact = new Contact();
        contact.setEmail(email);
        contact.setPhone(phone);

        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setAddress(address);
        student.setContact(contact);

        StudentService studentService = new StudentService();
        studentService.saveStudent(student);

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
