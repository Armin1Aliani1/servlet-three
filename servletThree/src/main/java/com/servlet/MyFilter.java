package com.servlet;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("My simple request : " + servletRequest.getRemoteAddr() + " " + servletRequest.getLocalAddr());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
