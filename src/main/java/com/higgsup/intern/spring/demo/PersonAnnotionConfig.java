package com.higgsup.intern.spring.demo;

import com.higgsup.intern.spring.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonAnnotionConfig {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean-annotion.xml");
    Person p = applicationContext.getBean(Person.class);

}
