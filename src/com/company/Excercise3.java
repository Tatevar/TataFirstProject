package com.company;

import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        int number = scan.nextInt();
        scan.close();
        if (number > 0 && number <10) {
            System.out.println(number + 1);
        }
        else if (number < 0) {
            System.out.println(number - 2);
        }
        else if (number == 10) {
            System.out.println(number);
        }
    }
}

