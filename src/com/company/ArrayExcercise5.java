/*5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое
 элементов каждого массива и сообщите,
для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
 */
package com.company;
import java.util.Random;

public class ArrayExcercise5 {
    public static void main(String[] args) {
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];
        double average1 = 0, average2 = 0;
        Random rnd = new Random();
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = rnd.nextInt(15);
            mas2[i] = rnd.nextInt(15);
        }
        for (int a : mas1)
            System.out.print(a + " ");
        System.out.println();
        for (int a : mas2)
            System.out.print(a + " ");
        for (int i = 0; i < mas1.length; i++) {
            average1 += mas1[i];
            average2 += mas2[i];
            average1 /= 5;
            average2 /= 5;
        }
        System.out.println();
            if (average1 > average2) {
                System.out.println("Среднее арифметическое первого массива (" + average1 + ") больше среднего арифметического " +
                        "второго массива (" + average2 + ")");
            } else if (average1 < average2) {
                System.out.println("Среднее арифметическое первого массива (" + average1 + ") меньше среднего арифметического " +
                        "второго массива (" + average2 + ")");
            } else {
                System.out.println("Средние арифметические массивов равны (" + average1 + ")");
            }
        }
    }





