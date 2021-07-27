//Разобраться со всеми интерфейсами и их реализациями. Попробовать руками все структуры данных и их возможности:
//• Добавлять • Удалять
//• Изменять • Поиск
//• Сортировка • и т. д.

import java.util.ArrayList;

public class MyArrayList {
    public static void main (String[] args) {
        ArrayList<String> Countries = new java.util.ArrayList<>();

        Countries.add("America");
        Countries.add("Armenia");
        Countries.add(2, "Brazil");
        Countries.add("Belarus");
        Countries.add("Italy");
        Countries.add("Greece");
        Countries.add("France");
        Countries.add("Spain");
        Countries.add("Germany");
        Countries.set(4, "Russia");
        Countries.remove("America");
        Countries.remove(5);

        if (Countries.contains("Greece")) {
            System.out.println("It's true");
        } else {
            System.out.println("It's false");
        }
        for (String country : Countries)
            System.out.println(country);
        System.out.println(Countries.get(0));
        System.out.println(Countries.size());
        Countries.ensureCapacity(25);

        Object[] countriesArray = Countries.toArray();
        for(Object count : countriesArray){

            System.out.println(count);
        }
        System.out.println ("Определить, есть ли элемент:" + Countries.isEmpty ());
        Countries.removeAll(Countries);
        System.out.println ("«Печатать после очистки элемента:»" + Countries );
        Countries.clear();
        System.out.println ("«Печатать после очистки элемента:»" + Countries );


    }
}
