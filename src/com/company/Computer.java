/*Создать класс компьютер.
Поля:
процессор
оперативка
жесткий диск
ресурс полных циклов работы (включений/выключений)
   Методы:
метод описание(вывод всех полей)
метод включить, при включении может произойти сбой,
при вывзове метода рандом загадывает число (0 либо 1),
вы вводите число с клавиатуры, если угадали комп выключается, если нет сгорает.
Если комп сгорел, при попытке включить нужно выдать сообщение что ему конец
- выключить (аналогично включению)
- при превышении лимита ресурса комп сгорает

 */

package com.company;

import java.util.Scanner;

public class Computer {
    public static void display() {
        int ram = 90;
        int cpu = 30;
        int hdd = 876;
        String turnOnOff = "yes";
        System.out.println(cpu);
        System.out.println(hdd);
        System.out.println(ram);
        System.out.println(turnOnOff);
        System.out.println();
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

