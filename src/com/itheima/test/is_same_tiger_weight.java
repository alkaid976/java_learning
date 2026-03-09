package com.itheima.test;

import java.util.Scanner;

public class is_same_tiger_weight {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请分别输入两只老虎的体重");
        int tiger_1 = sc.nextInt();
        int tiger_2 = sc.nextInt();
        String result = tiger_1 == tiger_2 ? "相同" : "不同";
        System.out.println(result);
    }
}
