package com.company;

public class Triangles2 {
    public static void main(String[] args) {


        String str = "******";

        for (int i = 5; i >= 0; i--) {
            System.out.println(str = str.substring(0, i));
        }
        for (int i = 0; i <= 5; i++) {

            System.out.println(str += "*");
        }
    }
}
//8) И ещё можете попрактиковаться и нарисовать оставшиеся 2 треугольника
//*
//* * (1)
//*** ****