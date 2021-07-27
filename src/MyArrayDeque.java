import java.util.LinkedList;

public class MyArrayDeque {
    public static void main(String[] args) {

        LinkedList<String> states = new LinkedList<>();
        states.add("Сalifornia");
        states.add("Florida");
        states.addLast("Texas");
        states.addFirst("Washington");
        states.add(1, "Italy");

        System.out.printf("List has %d elements \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Hawaii");
        for (String state : states) {

            System.out.println(state);
        }

        if (states.contains("Florida")) {

            System.out.println("List contains Florida");
        }

        states.remove("Florida");
        System.out.println(states);
        states.removeFirst();
        states.removeLast();
        System.out.println("show results after the removing" + states);
        while (states.peek() != null) {
            // извлечение c начала
            System.out.println(states.pop());}
        System.out.println("-----------------");

        LinkedList<Car> Cars = new LinkedList<>();
        Cars.add(new Car("Bmw"));
        Cars.addFirst(new Car("Audi"));
        Cars.addLast(new Car("Mitsubishi"));
        Cars.remove(1);

        for (Car car : Cars) {
            System.out.println(car.getName());
        }
        Car first = Cars.getFirst();
        Car last = Cars.getLast();
        System.out.println(first.getName());
        System.out.println(last.getName());

        }
    }

    class Car {

        private String name;

        public Car(String value) {

            name = value;
        }

        String getName() {
            return name;
        }
    }

