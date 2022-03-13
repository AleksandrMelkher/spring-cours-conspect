package org.example.spring;

public class Test1 {
    public static void main (String... args) {
        Pet petDog = new Dog();
        Pet petCat = new Cat();
        petDog.say();
        petCat.say();
    }
}
