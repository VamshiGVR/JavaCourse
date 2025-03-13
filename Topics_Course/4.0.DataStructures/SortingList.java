import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class SortingList {
    public static void main(String[] args){
        ArrayList<String>cars = new ArrayList<>();
            cars.add("Volvo");
            cars.add("Tata");
            cars.add("Bmw");
            cars.add("Ferrai");
            System.out.println(cars);
            Collections.sort(cars);
            System.out.println(cars);
        LinkedList<Integer> Numbers = new LinkedList<>();
            Numbers.add(1);
            Numbers.add(2);
            Numbers.add(3);
            Numbers.add(4);
            Numbers.add(5);
            System.out.println(Numbers);
            Collections.sort(Numbers, Collections.reverseOrder());
            System.out.println(Numbers);
    }
}