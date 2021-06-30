package com.company;

public class ArrayExcercise1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        for (int t = 0 ; t < nums.length; t++) {

            System.out.print(nums[t] + "  ");
            }

        for (int t = 0; t < nums.length; t++) {
            System.out.println("\n" + nums[t]);
        }
    }
}


//Создайте массив из всех чётных чисел от 2 до 20
// и выведите элементымассива на экран сначала в строку,
// отделяя один элемент от другого пробелом, а
//затем в столбик (отделяя один элемент от другого началом новой строки).
// Перед созданием массива подумайте, какого он будет размера.