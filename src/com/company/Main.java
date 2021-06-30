package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args){
        String str=String.format("Мне уже %d!",28);
        System.out.println(str);

        Date date=new Date();
        System.out.printf(Locale.ENGLISH,"%tb %tD, %tY",date,date,date);
    }

}









