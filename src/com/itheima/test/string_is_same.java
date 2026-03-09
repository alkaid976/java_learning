package com.itheima.test;

import java.util.Scanner;

public class string_is_same {
    public static void main(String[] args){

        String real_name = "zhoutianhao";
        String real_password = "20040903";

        boolean flag = false;

        for(int i = 0; i < 3; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String name = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            if(name.equals(real_name) && password.equals(real_password)) {
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("密码用户名输入正确");
        }
        else{
            System.out.println("密码用户名输入错误");
        }

    }
}
