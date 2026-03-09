package com.itheima.test;

import java.util.Scanner;

public class using_function_cs_square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        csSquare(l);
    }

    public static void csSquare(int l){
        int c = 4 * l;
        int s = l * l;
        System.out.println(c);
        System.out.println(s);
    }

}
