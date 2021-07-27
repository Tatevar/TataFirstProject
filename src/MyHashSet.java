import java.util.HashSet;

public class MyHashSet {
    public static void main (String[] args) {

        HashSet<Integer> chair = new HashSet<>();
        chair.add(1);
        chair.add(2);
        chair.add(3);
        chair.add(4);
        System.out.printf("List has %d elements \n", chair.size());
        System.out.println(chair);
        boolean isAdded = chair.add(3);
        System.out.println(isAdded);
        boolean isRemoved = chair.remove(4);
        System.out.println(isRemoved);
        boolean newAdded= chair.add(9);
        System.out.println(newAdded);
    }
}
