package com.itheima.test;

import java.util.Scanner;

public class weekends_and_weekday {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch(week){
            case 1,2,3,4,5:
                System.out.println("工作日");
                break;
            case 6,7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }

}
