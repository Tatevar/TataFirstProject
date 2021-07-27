import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator {
    public static void main(String[] args) {
        class PetComparator implements Comparator<Pets> {
            @Override

                public int compare (Pets o1, Pets o2){

                    if (o1.getAge() > o2.getAge())
                        return 1;
                    else if (o1.getAge() < o2.getAge())
                        return -1;
                    else
                        return 0;

                }
            }

        PetComparator pcomp = new PetComparator();
        TreeSet<Pets> pet = new TreeSet<>(pcomp);
        pet.add(new Pets("Cat", 2));
        pet.add(new Pets("Dog", 5));
        pet.add(new Pets("Cow", 6));
        pet.add(new Pets("Chicken", 1));
        for(Pets p : pet){

            System.out.println(p.getName() + " " + p.getAge());


        }

    }

    public static class Pets {
        private String name;

        private int age;
        public Pets(String n, int a){

            name=n;
            age=a;
        }
        String getName(){
            return name;}
        int getAge(){
            return age;}

        public int compareTo(Person p) {

            return name.compareTo(p.getName());
        }
    }
}
