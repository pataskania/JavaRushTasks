package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String odin = scanner.nextLine().toLowerCase();
        String dva = scanner.nextLine().toUpperCase();
        String tri = scanner.nextLine();

        
        System.out.println(tri);
        System.out.println(dva);
        System.out.println(odin);
    }
}
