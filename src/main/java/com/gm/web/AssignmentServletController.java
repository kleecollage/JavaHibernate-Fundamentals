package com.gm.web;

import com.gm.domain.Assignment;
import com.gm.service.AssignmentService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "AssignmentController", urlPatterns = "/AssignmentController")
public class AssignmentServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        AssignmentService assignmentService = new AssignmentService();
        List<Assignment> assignments = assignmentService.listAssignments();
        request.setAttribute("assignments", assignments);
        request.getRequestDispatcher("WEB-INF/listAssignments.jsp").forward(request, response);

    }
}
