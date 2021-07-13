package com.company;

import java.util.Scanner;

public class LightTransport  extends Land {
    int fuel = getFuel();
    String mark = getMark();
    int maxSpeed = getMaxSpeed();
    private String truсkType = "minivan";
    private int passengersCount = 6;
    private static double powerKilowatt = 5;
    private  int UnknownTime, km;

    @Override
    public void Display() {
        System.out.println("The truсk type is  " + truсkType + " and there are " + passengersCount + " passengers.");
    }

    public void Count() {
        powerKilowatt = powerKilowatt * 0.75;
        System.out.println(powerKilowatt);
    }

    public void CountKm() {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите время");
        UnknownTime = input.nextInt();
        for (int i = 0; i <= maxSpeed; i++) ;
        km = UnknownTime * maxSpeed;

        GasolineCount();
        System.out.printf("за время %d часов %s автомобиль, двигаясь с максимальной скоростью %d км/ч, проедет %d км и израсходует %d литров топлива.", UnknownTime, mark ,maxSpeed,km,fuel);
    }
    private void GasolineCount() {
        fuel =  km * fuel;
    }
}

//В классе Легковой добавляются поля:
//- Тип кузова
//- Кол-во пассажиров
//За время (ваше введённое время) ч,
// автомобиль (марка автомобиля) двигаясь с максимальной скоростью (ваша максимальная скорость) км/ч проедет
// (xxx) км и израсходует (xxx) литров топлива.


//Для легкового разработать метод который будет принимать время и считать сколько километро
// проедет машина двигаясь с максимальной скоростью и сколько топлива она израсходует за это время,
// результат вывести в консоль, расчёт израсходуемого топлива вынести в отдельный метод private
