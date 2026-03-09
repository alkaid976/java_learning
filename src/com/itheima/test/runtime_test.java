package com.itheima.test;

import java.lang.Runtime;
import java.lang.Object;

public class runtime_test {
    static public void main(String[] args)
    {
        Runtime runtime = Runtime.getRuntime();
        long max_memory = runtime.maxMemory();
        System.out.println((max_memory/8)/1024/1024);
        long total_memory = runtime.totalMemory();
        System.out.println((total_memory/8)/1024/1024);
        long free_memory = runtime.freeMemory();
        System.out.println((free_memory/8)/1024/1024);
    }
}
