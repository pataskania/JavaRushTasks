package com.javarush.task.pro.task07.task0708;

/* 
Правильные типы
*/

import java.util.Spliterator;

public class Solution {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValues(100);
    }

    public static void setValues(long value){
        Solution.a = (byte) value;
        Solution.b = (short) value;
        Solution.c = (int) value;
        Solution.d = (long) value;
    }
}
