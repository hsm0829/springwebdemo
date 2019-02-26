package com.spring.web.servlet;

import com.spring.web.bean.Person;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //从ServletContext（即application 域）中得到applicationContext，即IOC容器
        ServletContext servletContext=getServletContext();
        //从IOC容器中得到bean
        ApplicationContext ctx= (ApplicationContext) servletContext.getAttribute("ApplicationContext");
        Person person = ctx.getBean(Person.class);
        person.toStrign();
    }
}
