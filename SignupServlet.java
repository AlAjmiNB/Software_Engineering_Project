package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SignupServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        // Here you would normally interact with a database to register the user
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<h1>Registration Successful</h1>");
        out.println("<h2>Welcome, " + username + "</h2>");
        out.println("<a href='login.html'>Login</a>");
    }
}
