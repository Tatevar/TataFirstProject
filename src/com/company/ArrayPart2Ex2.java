//Проверить произведение элементов какой диагонали больше.
package com.company;

import java.util.Random;
import java.util.Scanner;

public class ArrayPart2Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your array size");
        int size = input.nextInt();
        int matrix[][] = new int[size][size];
        Random random = new Random();
        for (int[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                row[i] = random.nextInt(5) + 1;
            }
        }
        for (int[] row : matrix) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        int amount = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                amount *= matrix[i][j];
                break;
            }
        }

        int amount1 = 1;
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix.length - 1 - i; j < matrix.length; j++) {
                amount1 *= matrix[i][j];
                break;
            }
        }
        if (amount > amount1) {
            System.out.println("произведение элементов главной диагонали больше " + amount + " " + amount1 );
        }
        if (amount < amount1) {
            System.out.println("произведение элементов главной диагонали меньше " + amount + " " + amount1 );
        }
        if (amount == amount1){
            System.out.println("бла=бла " + amount + amount1);
        }
    }
}
