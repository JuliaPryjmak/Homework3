package com.epam.task5;

public class Task5 {
    public static void main(String[] args) {
        int number = 6;
        for (int i = 0; i <= number; i++) {
            for (int y = 0; y <= number - i; y++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <= number; i++) {
            for (int y = 0; y <= number - i; y++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}






