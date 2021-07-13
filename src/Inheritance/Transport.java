package Inheritance;

public class Transport {
    public int getResource() {
        return resource;
    }

    private int resource = 50;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private int maxSpeed = 10;

    public int getWeight() {
        return weight;
    }

    private int weight = 6000;

    public void Display() {
        System.out.println();
    }

    public String getMark() {
        return mark;
    }

    private String mark = "Audi";

    public static void main(String[] args) {
        LightTransport lightTransport = new LightTransport();
        lightTransport.Display();
        lightTransport.Count();
        lightTransport.CountKm();

        System.out.println();

        Military military = new Military();
        military.Display();
        military.Shoot();
        military.Ejection();

        System.out.println();

        Passenger passenger = new Passenger();
        passenger.Display();
        passenger.Load();

        System.out.println();

        Truck truck = new Truck();
        truck.Display();
        truck.Load();
    }
}

//Мощность(в лошадиных силах)
//- Максимальная скорость(км/ч)
//- Масса (кг)
//- Марка( например: Audi, BMW , Boing, Airbus, Scania , МАЗ и т.д. )

