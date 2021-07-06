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
                row[i] = random.nextInt(50) + 1;
            }
        }
        for (int[] row : matrix) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        int summ = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                summ += matrix[i][j];
                break;
            }
        }

        int summ2 = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix.length - 1 - i; j < matrix.length; j++) {
                summ += matrix[i][j];
                break;
            }
        }
        if (summ > summ2) {
            System.out.println("произведение элементов главной диагонали больше " + summ + summ2);
        }
        if (summ < summ2) {
            System.out.println("произведение элементов главной диагонали меньше " + summ + summ2);
        }
    }
}
