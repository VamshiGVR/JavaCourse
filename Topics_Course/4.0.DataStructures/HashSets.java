import java.util.HashSet;

public class HashSets {

    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Volvo");
        cars.add("Tata");
        cars.add("Not a car");
        System.out.println("Cars: "+ cars+'\n');

        if(cars.contains("Not a car"))
        {
        cars.remove("Not a car");
        System.out.println("Removed");
        }
        else
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);
    
    }   
}
