package com.itheima.test;

import java.util.Scanner;

public class dividend_divisor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int temp_dividend = dividend;
        int divisor = sc.nextInt();
        int count = 0;
        while(dividend >= divisor){
            dividend -= divisor;
            count++;
        }
        System.out.println(temp_dividend + "÷" + divisor + "=" + count + "......" + dividend);
    }
}
