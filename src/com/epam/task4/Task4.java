package com.epam.task4;

public class Task4 {
    public static void main(String[] args) {
        int number = 5;
        for (int i = number - 1; i >= 0; i--){
            for (int y = 0; y < i; y++){
                System.out.print(" ");
            }
            for (int j = i - 1; j < number - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < number; i++){
            for (int y = 0; y <= i; y++){
                System.out.print(" ");
            }
            for (int j = i; j < number - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
