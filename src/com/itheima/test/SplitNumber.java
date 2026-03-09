package com.itheima.test;
import java.util.Scanner;
public class SplitNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Dig_1 = num % 10;
        int Dig_2 = num/10 % 10;
        int Dig_3 = num/100 % 10;
        System.out.println("该三位数的个位数是" + Dig_1);
        System.out.println("该三位数的十位数是" + Dig_2);
        System.out.println("该三位数的百位数是" + Dig_3);
    }
}
