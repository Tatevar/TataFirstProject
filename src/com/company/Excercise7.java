package com.company;

import java.util.Scanner;

public class Excercise7 {
    public static void main(String[] args) {
        int programmers = 0;
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        programmers = Scan.nextInt();

        if (programmers > 0 && programmers < 2) {
            System.out.println(programmers + " программист");

        } else if (programmers == 2) {
            System.out.println(programmers + " программиста");

        } else if (programmers >= 10) {
            System.out.println(programmers + " программистов");
        }
    }
}