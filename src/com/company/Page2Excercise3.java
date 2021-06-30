package com.company;

public class Page2Excercise3 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while (num <= 256) {
            sum += num;
            num++;
        }
        System.out.println("The sum is " + sum);
    }
}
//)Вычислить: 1+2+4+8+...+256
