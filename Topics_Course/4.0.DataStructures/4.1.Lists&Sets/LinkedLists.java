
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> Numbers = new LinkedList<>();
        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(3);
        Numbers.add(4);
        Numbers.add(5);
        System.out.println(Numbers);
        System.out.println();
  
        for (int i : Numbers){
            System.out.println(i);  
        }
        System.out.println();

        // Add numbers at Last
        Numbers.addLast(6);
        System.out.println(Numbers);
        System.out.println();

        //Add number at First
        Numbers.addFirst(0);
        System.out.println(Numbers);
        System.out.println();

        //get First
        System.out.println(Numbers.getFirst());
        System.out.println();

        //get Last
        System.out.println(Numbers.getLast());
        System.out.println();

        //Remove first 
        Numbers.removeFirst();
        System.out.println(Numbers);
        System.out.println();

        //Removes last
        Numbers.removeLast();
        System.out.println(Numbers);
        System.out.println();
    }
}
