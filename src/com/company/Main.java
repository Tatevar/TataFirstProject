package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();

        Computer.display();
        Computer.turnOn();
        Computer.turnOff();
        int i = 10;
        while (i > computer.resource)
            i--;
        System.out.println("Computer is turned on ");
        if (i < computer.resource) ;
        System.out.println("Computer can't be turned on ");
    }
}








