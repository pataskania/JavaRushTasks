package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        boolean oenb = (one == two && one == three);
        boolean twob =(one==two);
        boolean threeb = (two==three);

        if (oenb) {
            System.out.println(one + " " + two + " " + three);
        }else if (twob) {
            System.out.println(one + " " + two);
        }else
            System.out.println(two+ " " + three);

        }
    }



