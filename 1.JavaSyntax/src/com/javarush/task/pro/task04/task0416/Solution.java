package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int countofbottle = scanner.nextInt();
       int people = scanner.nextInt();
       double result = countofbottle * 1.0/people;
        System.out.println(result);
    }
}