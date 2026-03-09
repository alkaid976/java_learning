package com.itheima.test;

public class print_times {
    public static void main(String[] args){
        double height = 0.1;
        int times = 0;
        while(height < 8844430){
            height *= 2;
            times += 1;
        }
        System.out.println(times);
    }
}
