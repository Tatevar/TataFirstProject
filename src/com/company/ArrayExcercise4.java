package com.company;
import java.util.Random;

public class ArrayExcercise4 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int number = rnd.nextInt(20) + 1;
        System.out.println("The random number is " + number);
        int array[] = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(20) + 1;
        }
        for (int a : array)
            System.out.print(a + " ");

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }

            System.out.println(" ");
            for (int a : array) {
                System.out.print(a + " ");
            }
        }
    }

//Создайте массив из 20 случайных целых чисел из отрезка [0;20].
// Выведите массив на экран в строку. Замените каждый элемент с
// нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.