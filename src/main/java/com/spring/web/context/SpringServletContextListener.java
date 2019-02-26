package com.spring.web.context;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SpringServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //获取spring配置文件的名称
        ServletContext servletContext=servletContextEvent.getServletContext();
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");

        //1、创建IOC容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext(contextConfigLocation);
        //2、把ioc容器，放在ServletContext的一个属性中
        servletContext.setAttribute("ApplicationContext",ctx);



    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
