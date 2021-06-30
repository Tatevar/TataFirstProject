package com.company;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        System.out.print("a = ");
        int a = Scan.nextInt();

        System.out.print("b = ");
        int b = Scan.nextInt();

        System.out.print("c = ");
        int c = Scan.nextInt();

        String no = ("Треугольник не существует.");
        String yes = ("Треугольник существует.");
        if (a + b > c && a + c > b && b + c > a)
            System.out.println(yes);
        else if (a > (b + c))
            System.out.println(no);
        else if (b > (a + c))
            System.out.println(no);
        else if (c > (a + b))
            System.out.println(no);
        else System.out.println("Do not much");
    }
}
