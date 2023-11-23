package org.example;

import org.example.models.Department;
import org.example.models.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee e = context.getBean("e1",Employee.class);
        System.out.println(e);
        Department d = context.getBean("d2",Department.class);
        System.out.println(d);

    }
}