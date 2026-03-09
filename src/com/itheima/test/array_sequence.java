package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class array_sequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Random r = new Random();
        for(int i = 0; i < arr.length; i++){
            int RandomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[RandomIndex];
            arr[RandomIndex] = temp;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
