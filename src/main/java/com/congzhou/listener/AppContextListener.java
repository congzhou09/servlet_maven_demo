package com.congzhou.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("context被创建");
        ServletContext ctx = servletContextEvent.getServletContext();
        System.out.printf("获取参数值: %s \n", ctx.getInitParameter("PARAM"));
    }
}
