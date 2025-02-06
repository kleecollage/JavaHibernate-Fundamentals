package com.web.web;

import com.web.domain.Person;
import com.web.service.PersonsService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletController", urlPatterns = "/ServletController")
public class ServletController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PersonsService personsService = new PersonsService();

        List<Person> persons = personsService.listPersons();
        request.setAttribute("persons", persons);
        try {
            request.getRequestDispatcher("WEB-INF/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
