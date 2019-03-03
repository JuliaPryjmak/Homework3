package com.epam.task3;

public class Task3 {
    public static void main(String[] args) {
        int number = 5;

        for (int i = number - 1; i >= 0; i--){
            for (int y = 0; y < i; y++){
                System.out.print(" ");
            }
            for (int j = i; j < number; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
