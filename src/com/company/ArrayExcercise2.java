package com.company;

import java.util.Random;

public class ArrayExcercise2 {
    public static void main(String[] args) {

        int[] numbers = new int[50];
        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = (i * 2) + 1;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}






//Создайте массив из всех нечётных чисел от 1 до 99,
// выведите его на экран в строку, а затем этот же массив выведите
// на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
