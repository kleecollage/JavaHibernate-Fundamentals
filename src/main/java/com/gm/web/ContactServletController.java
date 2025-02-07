package com.gm.web;

import com.gm.domain.Contact;
import com.gm.service.ContactService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ContactController", urlPatterns = "/ContactController")
public class ContactServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ContactService contactService = new ContactService();
        List<Contact> contacts = contactService.listContacts();
        request.setAttribute("contacts", contacts);

        try {
            request.getRequestDispatcher("WEB-INF/listContacts").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace(System.out);
        }
    }

}
