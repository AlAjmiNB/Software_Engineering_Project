package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        if ("admin".equals(username) && "admin123".equals(password)) {
            out.println("<h1>Welcome, " + username + "!</h1>");
        } else {
            out.println("<h1>Login Failed</h1>");
            out.println("<a href='login.html'>Try Again</a>");
        }
    }
}
