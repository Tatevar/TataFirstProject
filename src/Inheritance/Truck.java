package Inheritance;

    public class Truck extends Land {
        private int carrying = 2500, UnknownCount;
        int weight = getWeight();

        @Override
        public void Display() {
            System.out.println("the carrying of the truck is " + carrying + " kg");
        }

        public void Load() {
            if (weight <= carrying) {
                System.out.println("Грузовик загружен");
            }
            if (weight > carrying) {
                System.out.println("Вам нужен грузовик побольше ");
            }
        }
    }

//В классе Грузовой добавляется поле: - Грузоподъёмность
//Для грузового разработать метод который проверит можно ли загрузить в него xxx груза
// Метод должен проверять если это кол-во груза помещается в грузовик то выводит в консоль ”Грузовик загружен”,
// если кол-во груза которое нужно загрузить больше чем то которое может влезть в наш грузовик то выводим“Вам
// нужен грузовик побольше ”.

