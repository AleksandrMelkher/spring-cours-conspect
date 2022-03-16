package org.example.spring;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Объект пес создан");
    }

    @Override
    public void say() {
        System.out.println("Гав-Гав");
    }
}
