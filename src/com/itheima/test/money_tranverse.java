package com.itheima.test;

public class money_tranverse {
    public static void main(String[] args){
        money_traverse(12345869);

    }
    public static void money_traverse(int money){
        int ge = money % 10;
        money /= 10;
        int shi = money % 10;
        money /= 10;
        int bai = money % 10;
        money /= 10;
        int qian = money % 10;
        money /= 10;
        int wan = money;
        System.out.println();
    }
    public static String Chinese_number(int num){
        String [] Chinese_num = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return Chinese_num[num];
    }
}
