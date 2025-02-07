package com.gm.web;

import com.gm.dao.AddressDao;
import com.gm.domain.Address;
import com.gm.service.AddressService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "AddressController", urlPatterns = "/AddressController")
public class AddressServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        AddressService addressService = new AddressService();
        List<Address> addresses = addressService.listAddresses();
        request.setAttribute("addresses", addresses);

        try {
            request.getRequestDispatcher("WEB-INF/listAddresses").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace(System.out);
        }

    }

}
