package com.company;

import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.print("A = ");
        int A = Scan.nextInt();
        System.out.print("B = ");
        int B = Scan.nextInt();
        System.out.print("C = ");
        int C = Scan.nextInt();
        int count = 0;
        if (A > 0)
            count++;
        if (B > 0)
            count++;
        if (C > 0)
            count++;
        System.out.println("Count of the Negative numbers: " + ( 3-count));
        System.out.println("Count of the Positive numbers: " + count);
    }
}