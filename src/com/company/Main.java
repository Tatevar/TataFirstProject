package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    for ( int i = 0 ; i <= Computer.resource; i++){
            Computer.turnOn();
        }
        Computer.display();
        Computer.turnOff();

    }
}