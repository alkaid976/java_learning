package com.itheima.test;

public class Cat extends Animal{
    String category_cat;
    @Override
    public void cry(){
        System.out.println("我们一起学猫叫");
    }

    public Cat() {
    }

    public Cat(String animal_name, int age, String category_cat) {
        super(animal_name, age);
        this.category_cat = category_cat;
    }
}
