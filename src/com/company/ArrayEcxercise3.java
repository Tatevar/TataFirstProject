package com.company;

import java.util.Random;

public class ArrayEcxercise3 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random rnd = new Random();
        int number = rnd.nextInt(99);
        System.out.println("Random number: " + number);

        int pos, j = 0;
        for (pos = 1; pos < array.length; pos++)

            if (array[pos]% 2 == 0) {
                        j++;

                    }
        System.out.println(j);
            }
    }

//Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите массив на экран.
//Подсчитайте сколько в массиве
//  чётных элементов и выведете это количество на экран на отдельной строке.