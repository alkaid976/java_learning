package com.itheima.test;

import java.util.Scanner;


public class is_6or6_times {
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean result = a == 6 || b == 6 || (a + b) % 6 == 0;
        System.out.println(result);
    }
}
