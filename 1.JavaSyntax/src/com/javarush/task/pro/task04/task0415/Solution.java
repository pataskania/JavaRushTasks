package com.javarush.task.pro.task04.task0415;

import java.text.DecimalFormat;
import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextInt();
        double pi = 3.14;
        double a = pi * radius * radius;
        int S = (int)(a);
        System.out.println(S);


    }
}