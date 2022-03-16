package org.example.spring;

public class Cat implements Pet {

     public Cat () {
         System.out.println("Объект кот создан");
     }
    @Override
    public void say() {
        System.out.println("Мяу-Мяу");
    }
}
