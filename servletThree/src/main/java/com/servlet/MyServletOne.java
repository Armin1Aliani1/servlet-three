package com.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class MyServletOne extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        ServletContext context = getServletContext();
        String country = context.getInitParameter("country");

        ServletConfig config = getServletConfig();
        String title = config.getInitParameter("title");

        context.setAttribute("email", "example@example.com");

        response.setContentType("text/html");

        String date = "Local date time : " + new Date();

        try {
            PrintWriter out = response.getWriter();
            out.println("<h3>Hi there</h3>");
            out.println("<h4>" + country + "</h4>");
            out.println("<head><title>" + title + "</title></head>");
            out.println("<h5>" + title + "</h5>");
            out.println("<p>" + date + "</p>");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
