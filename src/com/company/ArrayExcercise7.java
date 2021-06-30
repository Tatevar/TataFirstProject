//Создайте массив из 12 случайных целых чисел из отрезка [0;15].
// Определите какой элемент является в этом массиве максимальным и
// сообщите индекс его последнего вхождения в массив.
package com.company;

import java.util.Random;

public class ArrayExcercise7 {
    public static void main(String[] args) {
        int[] mas = new int[12];
        int maxindex = 0, maxnumber = 0;
        Random rnd = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rnd.nextInt(15);
            if (maxnumber <= mas[i]) {
                maxnumber = mas[i];
                maxindex = i;

            }
        }
        System.out.println("Индекс максимального элемента: " + maxindex);
    }
}
