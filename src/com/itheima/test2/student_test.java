package com.itheima.test2;

public class student_test {
    public static void main(String[] args){
        Student stu = new Student();
        stu.setAge(21);
        stu.setName("周天昊");
        stu.setNum(1);

        System.out.println(stu.getAge());
        System.out.println(stu.getNum());
        System.out.println(stu.getName());

    }
}
