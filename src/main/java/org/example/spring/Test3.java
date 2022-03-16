package org.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml")) {
            Person person = context.getBean("myPerson", Person.class);
            person.callYourPet();

            System.out.println(person.getAge());
            System.out.println(person.getName());
        }
    }
}
