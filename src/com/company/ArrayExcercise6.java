package com.company;

import java.util.Random;

public class ArrayExcercise6 {
    public static void main(String[] args){
        int nums [] = new int[4], flag=0;
        Random rnd = new Random();
        int number = rnd.nextInt(10) ;
        System.out.println("The random number is " + number);
        for (int i = 0 ; i < nums.length; i++){

        }
        System.out.println();
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i]>nums[i+1]) {
                flag = 1;
                break;
            }
        }
        if(flag==1) {
            System.out.println("Последовательность не возрастающая");
        } else {
            System.out.println("Последовательность возрастающая");
        }
    }
}

//Создайте массив из 4 случайных целых чисел из отрезка [0;10],
// выведите его на экран в строку. Определить и вывести на экран
// сообщение о том, является ли массив строго возрастающей последовательностью.