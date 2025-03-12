import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String>cars = new ArrayList<String>();
        //Add
        cars.add("Volvo");
        cars.add("Tata");
        cars.add("Bmw");
        cars.add("NotCar");
        System.out.println(cars);
        
        //ForLooping Array
        for (String i: cars){
            System.out.println("Cars: "+ i);
        }

        // Add Elment in front
        cars.add(0,"Honda");
        System.out.println(cars);

        //get
        System.out.println(cars.get(0));

        //set
        cars.set(3,"BMW");
        System.out.println(cars);

        //remove
        cars.remove(4);
        System.out.println(cars);

        //size
        System.out.println(cars.size());

        //clear
        cars.clear();
        System.out.println(cars);

        System.out.println();


        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(40);
        Numbers.add(90);
        Numbers.add(50);
        Numbers.add(20);
        System.out.println(Numbers);
        System.out.println();
        Collections.sort(Numbers);
        for(int x: Numbers)
        System.out.println(x);
    }
}
