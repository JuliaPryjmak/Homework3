package com.epam.task1;

public class Task1 {
    public static void main(String[] args) {
        int number = 8;

        for (int i = 0; i < number; i++){
            for(int y = 0; y < i; y++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = number - 2; i > 0; i--){
            for (int y = 0; y < i; y++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


}
