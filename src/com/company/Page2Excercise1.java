package com.company;

public class Page2Excercise1 {
    public static void main(String[] args) {
 int days = 7, daysCounter = 0;
 double firstDay = 10, sum = firstDay;

while ( daysCounter < days - 1){
    firstDay = firstDay;
    firstDay = firstDay + (firstDay * 0.1);
 sum = sum + firstDay;
 daysCounter++;
}
            System.out.println(" The answer is " +  sum +  " = " + days);
    }
}
