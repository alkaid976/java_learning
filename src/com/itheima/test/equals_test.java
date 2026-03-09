package com.itheima.test;

public class equals_test {
    static public void main(String[] args){
        IDCard id1 = new IDCard("01", "zhutianci", "123456");
        IDCard id2 = new IDCard("02", "zhoutianhao", "123456");
        IDCard id3 = id2;

        System.out.println("id1.equals(id2)" + id1.equals(id2));
        System.out.println("id2.equals(id3)" + id2.equals(id3));
        System.out.println("我现在更改了一些内容");
    }
}
