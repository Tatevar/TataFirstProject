package Inheritance;

import java.util.Scanner;

    public class Military extends Air {
        private boolean ejection;
        private int rocket;

        @Override
        public void Display() {
            System.out.println("The quantity of the  rockets is " + rocket + " and the ejection is " + ejection);
        }

        public void Shoot() {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите количество рокетов на борту");
            rocket = input.nextInt();
            if (rocket != 0)
                System.out.println("Ракета пошла...");
            if (rocket == 0)
                System.out.println("Боеприпасы отсутствуют");
        }

        public void Ejection() {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите значение");
            ejection = input.nextBoolean();

            if (ejection = true)
                System.out.println("Катапультирование прошло успешно");

            else if (ejection = false )
                System.out.println("У вас нет такой системы");
            }
        }


//Наличие системы катапультирования (true/false)
//- Кол-во ракет на борту
// Для Военных самолётов делаем метод выстрел,
// проверяем если кол-во ракет не равно 0 то выводим на консоль “ Ракета пошла...”, если 0 то
//“Боеприпасы отсутствуют”.
// А так же метод катапультирование, который проверит
// если наличие системы катапультирования true,
// то выводим “Катапультирование прошло успешно”, если false, то “У вас нет такой системы ”
