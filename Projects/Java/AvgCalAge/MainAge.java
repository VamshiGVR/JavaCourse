public class MainAge {
    public static void main(String[] args) {
        int Ages[] = {25,29,40,21,55};
        int sum = 0;

        // Age at particular place
        System.out.println("Ages: " + Ages[0]);
        for(int age:Ages){
            sum +=age;
        }
        // Totat of all ages
        System.out.println("Total: " + sum);

        // Average of all ages.
        int avg = sum/Ages.length;
        System.out.println("Average: " + avg);

        // Find lowest Age
        int lowestAge= Ages[0];
        for(int age:Ages){
            if (lowestAge>age)
            lowestAge = age;
        }
        System.out.println("Lowest Age is " + lowestAge);   
        
        // Find higest age
        int higestAge = Ages[0];
        for(int age:Ages){
            if(higestAge<age)
            higestAge = age;
        }
        System.out.println("highest Age is " + higestAge);   

    }
}
