package com.epam.task2;

public class Task2 {
    public static void main(String[] args) {
        int number = 5;

        for (int i = 0; i < number; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int j = i; j< number; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
