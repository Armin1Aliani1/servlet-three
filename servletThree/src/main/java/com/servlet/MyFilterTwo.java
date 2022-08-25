package com.servlet;

import javax.servlet.*;
import java.io.IOException;

public class MyFilterTwo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Inside my filter two 22222222222222222222222222222222222222222222");
    }

    @Override
    public void destroy() {

    }
}
