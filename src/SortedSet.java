import java.util.NavigableSet;
import java.util.TreeSet;

public class SortedSet {
    public static void main(String[] args) {
        TreeSet<String> Countries = new TreeSet<>();
        Countries.add("America");
        Countries.add("Armenia");
        Countries.add("Brazil");
        Countries.add("Belarus");
        Countries.add("Italy");
        Countries.add("Greece");
        Countries.add("France");
        Countries.add("Spain");
        Countries.add("Germany");
        System.out.printf("TreeSet contains %d elements \n", Countries.size());
        Countries.remove("America");
        for (String country : Countries)
            System.out.println(country);
        System.out.println("-----------------");
        System.out.println(Countries.first());
        System.out.println(Countries.last());
        Countries.pollFirst();
        Countries.pollLast();
        System.out.println(Countries);
        String greater = Countries.higher("Germany");

        String lower = Countries.lower("Germany");

        System.out.println(lower);
        System.out.println(greater);
        System.out.println("-------------");
        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("Tom"));
        for (Person person : people) {

            System.out.println(person.getName());
        }
    }
}
    class Person implements Comparable<Person>{

        private String name;
        Person(String name){

            this.name = name;
        }
        String getName(){return name;}

        public int compareTo(Person p){

            return name.compareTo(p.getName());
        }

    }
