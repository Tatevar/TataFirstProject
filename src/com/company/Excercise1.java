package com.company;

import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        int num ;
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        num = Scan.nextInt();

        if (num < 10 && num>0) {
            System.out.println("The number is one-digit " + num);
        }
        if (num <= 100 && num >=10) {
            System.out.println("The number is two-digit " + num);
        }
        if (num >= 100 && num < 1000) {
            System.out.println("The number is three-digit " + num);
        }

        if (num > 1000 && num < 10000) {
            System.out.println("The number is four-digit " + num);
        }
        else{
                System.out.println("invalid number " + num);
            }
        }
    }

