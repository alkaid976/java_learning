package com.itheima.test;
//1. 导包（书写需要注意：要写在类定义的上面）
import java.util.Scanner;

public class Scannerdemo1 {
    public static void main(String[] args){
        //2. 创建对象，表示我现在要使用Scanner这个类
        Scanner sc = new Scanner(System.in);
        //3. 接收数据
        //此时，变量i记录了键盘录入的数据
        int i = sc.nextInt();

        System.out.println(i);
    }
}
