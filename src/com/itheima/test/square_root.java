package com.itheima.test;

import java.util.Scanner;

public class square_root {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int wait_num = sc.nextInt();
        int test_num = 1;
        while(test_num*test_num <= wait_num){
            test_num++;
        }
        test_num--;
        if(test_num*test_num == wait_num){
            System.out.println(test_num + "就是" + wait_num + "的平方根");
        }
        else{
            System.out.println(test_num + "是" +wait_num + "的平方根的整数部分");
        }

    }
}
