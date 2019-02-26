package com.spring.web.bean;

public class Person {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void toStrign(){
        System.out.println(" 自定义模拟创建ioc容器..... ");
    }
}
