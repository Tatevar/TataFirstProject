//Создаём квадратную матрицу, размер вводим с клавиатуры.
// Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
// Вывести нечетные элементы находящиеся под главной диагональю(включительно)

package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPart2Ex1 {
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

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] % 2 != 0) {
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }
}


