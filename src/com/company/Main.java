package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.cpu = 30;
        computer.hdd = 8;
        computer.ram = 300;
        computer.turnOnOff = "yes";
        System.out.println(computer.cpu );
        System.out.println( computer.hdd);
        System.out.println( computer.ram);
        System.out.println( computer.turnOnOff);
        System.out.println();
        turnOn();
        turnOff();
    }
    public static void  turnOn (){

        int UnknownNumber, UserNumber;
        Scanner input = new Scanner(System.in);

        System.out.println("ЗАДАЧА: Угадать число (от 0 до 1).");

        UnknownNumber = (int)Math.floor(Math.random() * 1);

            System.out.print("Введите ваше число: ");

            UserNumber = input.nextInt();

            if (UserNumber == UnknownNumber)
                System.out.println(" Ваш компьютер включен");

            else if (UserNumber != UnknownNumber)
                System.out.println("сбой, " +  "Ваш компьютер сгорел ");
    }

    public static void  turnOff (){

        int UnknownNumber, UserNumber;
        Scanner input = new Scanner(System.in);

        System.out.println("ЗАДАЧА: Угадать число (от 0 до 1).");

        UnknownNumber = (int)Math.floor(Math.random() * 1);

        System.out.print("Введите ваше число: ");

        UserNumber = input.nextInt();

        if (UserNumber == UnknownNumber)
            System.out.println(" Ваш компьютер выключен");

        else if (UserNumber != UnknownNumber)
            System.out.println( "При превышении лимита ресурса, ваш компьютер сгорел ");
    }
}







