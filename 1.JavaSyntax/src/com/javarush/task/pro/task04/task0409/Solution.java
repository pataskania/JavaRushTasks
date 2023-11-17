package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        while (scanner.hasNextInt()){
            int number = scanner.nextInt();
            if (number < min){
                System.out.println(min);
                if(scanner.hasNextLine()){
                    String string = scanner.nextLine();
                }
            }
        }
    }
}