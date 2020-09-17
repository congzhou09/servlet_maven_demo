package com.congzhou.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;

public class LogFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String url = ((HttpServletRequest) servletRequest).getRequestURL().toString();
        System.out.printf("%tT 访问url：%s \n", new Date(), url);
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
