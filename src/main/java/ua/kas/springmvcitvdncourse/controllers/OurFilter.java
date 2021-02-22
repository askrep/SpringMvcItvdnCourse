package ua.kas.springmvcitvdncourse.controllers;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
@Order(1)
public class OurFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println(request.getRemoteAddr());
        System.out.println(request.getRemoteHost());
    }
}
