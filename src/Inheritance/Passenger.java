package Inheritance;

import java.util.Scanner;

public class Passenger extends Air {
    private int quantityPassengers = 35, UnknownCount;
    private boolean businessClass = true;

    @Override
    public void Display() {
        System.out.println("The quantity of the passengers is  " + quantityPassengers + " and the business class is " + businessClass);
    }

    public void Load() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество пассажиров");
        UnknownCount = input.nextInt();
        if (UnknownCount <= quantityPassengers) {
            System.out.println("Самалет загружен");
        }
        if (UnknownCount > quantityPassengers) {
            System.out.println("Вам нужен Самалет побольше ");
        }
    }
}
//- Кол-во пассажиров
//- Наличие бизнес класса (true/false)
// Такой же метод делаем для Гражданских самолётов, только проверяем вместимость пассажиров.
