package com.itheima.test;

public class copy_array {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        copyArray(arr, 3, 7);
    }
    public static void copyArray(int[] arr, int from, int to){
        int[] arr_copy = new int[to - from];
        int index = 0;
        for(int i = from; i < to; i++){
            arr_copy[index] = arr[i];
            index++;
        }
        for (int j : arr_copy) {
            System.out.print(j + " ");
        }
    }
}
