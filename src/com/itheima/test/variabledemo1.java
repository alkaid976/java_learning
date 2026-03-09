package com.itheima.test;

public class variabledemo1 {
    public static void main(String[] args){
//        一开始没有乘客
        int count = 0;
//        第一站：上去一个乘客
        count = count + 1;
//        第二站：上去两个乘客下来一个乘客
        count = count + 2 - 1;
        System.out.println(count);
    }
}
