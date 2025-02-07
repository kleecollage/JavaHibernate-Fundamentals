package com.gm.web;

import com.gm.dao.AddressDao;
import com.gm.service.AddressService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AddressController", urlPatterns = "/AddressController")
public class AddressServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO
        AddressService addressService = new AddressService();

    }

}
