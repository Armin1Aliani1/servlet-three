package com.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServletTwo implements Servlet {
    ServletConfig config = null;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
        System.out.println("Yes!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        ServletContext context = request.getServletContext();
        String country = context.getInitParameter("country");

        ServletConfig config = getServletConfig();
        String title = config.getInitParameter("title");

        response.setContentType("text/html");
        try {
            PrintWriter out = response.getWriter();

            out.println("<h3>Bye there</h3>");
            out.println("<p><b>" + country + "</b></p>");
            out.println("<head><title>" + title + "</title></head>");
            out.println("<h5>" + title + "</h5>");

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Bye!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
