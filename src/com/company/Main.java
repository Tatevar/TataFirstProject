package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
for ( int i = 0 ; i <= Computer.resource; i++){
        Computer.turningOn();
        }
        Computer.display();
        Computer.turnOn();
        Computer.turnOff();
    }
}


/*
        Уменьшать ресурс сам надо, не нужно никаких циклов делать

        Тоест вызываете метод. Turnon  внутри делаете resours--

        Цикл можно в мейне написать где вы только computer.turnon делать будете


        И проверка что resours ==0 тоже внутри. Turnon

 */
