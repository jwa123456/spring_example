package com.job.constructor;

import com.job.constructor.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanConfig.xml");
        Person person = (Person) applicationContext.getBean("person");
        person.input();
    }
}
