package com.itheima.test;

import java.util.Scanner;
import java.util.ArrayList;

public class find_id {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<IDCard> array = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            System.out.println("请输入编号");
            String id_num = sc.next();
            System.out.println("请输入姓名");
            String name = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            IDCard new_card = new IDCard(id_num, name, password);
            array.add(new_card);
        }
        System.out.println("请输入您想搜索的id");
        String id = sc.next();
        boolean status = find_id_func(array, id);
        if(status){
            System.out.println("OK");
        }
    }
    public static boolean find_id_func(ArrayList<IDCard> array, String id){
        for (IDCard idCard : array) {
            if (id.equals(idCard.getId())) {
                System.out.println("搜索到相关信息");
                return true;
            }
        }
        System.out.println("未搜索到相关信息");
        return false;
    }
}

