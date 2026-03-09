package com.itheima.test;

public class func_array_print {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                System.out.print(arr[i]);
            }
            else {
                System.out.print(arr[i] + ","); //注意这个地方，如果是直接print的话，我们就是不进行换行操作的
            }
        }
    }
}
