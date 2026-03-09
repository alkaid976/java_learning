package com.itheima.test;

public class string_add {
    public static String string_concat(int[] arr){
        if(arr == null){
            return "";
        }
        if(arr.length == 0){
            return "[]";
        }
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < arr.length - 1; i++) {
            result.append(arr[i]).append(",");
        }
        result.append(arr[arr.length - 1]).append("]");
        return result.toString();
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 9, 0};
        String result = string_concat(arr);
        System.out.println(result);
    }
}
