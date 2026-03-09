package com.itheima.test;

public class Animal {
    String animal_name;
    int age;
    public void run(){
        System.out.println("我会跑");
    }
    public void cry(){
        System.out.println("我会叫");
    }

    public Animal() {
    }

    public Animal(String animal_name, int age) {
        this.animal_name = animal_name;
        this.age = age;
    }
}

