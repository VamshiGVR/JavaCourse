//Overloading method.
// It usually has same name of method but it takes different parameters.
public class OverLoadingMethod {
    public static void main(String[] args) {
        System.out.println(Add(5, 5));      
        System.out.println(Add(5.5, 4.5));        
  
    }

    //Method 1: Takes Int as parameters
    public static int Add(int a, int b){
        return a+b;
    }
    //Method 2: Takes doubles as parameteres
    public static double Add(double a, double b){
        return a+b;
    } 
}
