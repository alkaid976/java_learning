package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_student {
    public static void main(String[] args){
        ArrayList<Student> StuArray = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            String name = sc.next();
            int age = sc.nextInt();
            Student stu = new Student(name, age);
            StuArray.add(stu);
        }
        for(int i = 0; i < StuArray.size(); i++){
            System.out.println(StuArray.get(i).getName());
            System.out.println(StuArray.get(i).getAge());
        }
    }


}
