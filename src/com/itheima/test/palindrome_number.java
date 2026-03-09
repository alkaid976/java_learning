package com.itheima.test;

import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int original_num = sc.nextInt();
        int temp = original_num;
        int palindrome_num = 0;
        while(original_num != 0){
            int ge = original_num % 10;
            palindrome_num = palindrome_num*10 + ge;
//            System.out.println(palindrome_num);
            original_num /= 10;
        }
        System.out.println(palindrome_num);
        if(palindrome_num == temp){
            System.out.println(palindrome_num+"是回文数");
        }
        else{
            System.out.println(palindrome_num+"不是回文数");
        }
    }
}
