package com.itheima.test;

import java.util.Scanner;

public class whose_clothe_fashion {
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int my_clothe = sc.nextInt();
        int his_clothe = sc.nextInt();
        boolean whose_fashion = my_clothe > his_clothe;
        System.out.println(whose_fashion);
    }
}
