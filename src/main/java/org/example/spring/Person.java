package org.example.spring;

public class Person {
    private Pet pet;
    private String name;
    private int age;

//    public Person() {
////        this.pet = pet;
//        System.out.println("Объект персона создан.");
//    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPet(Pet pet) {
        System.out.println("В класс персона добавлен класс животное");
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void callYourPet() {
        System.out.println("Привет моя любимая животинка!");
        pet.say();
    }
}
