package com.company;

import java.util.Scanner;

public class Page2excercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount of the time: ");
        int x = scan.nextInt();
        int cellOfAmeoba = 1;
        for(int i = 0; i < x/3; i++){
            cellOfAmeoba *= 2;
        };
        System.out.printf("in %d hours will be %d cells of ameoba" , x ,cellOfAmeoba);
    }
}
/*2)Одноклеточная амеба каждые 3 часа делится на 2 клетки.
 Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */