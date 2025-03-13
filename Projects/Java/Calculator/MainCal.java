import java.util.Scanner;

public class MainCal {
    public static void main(String[] args) {
        int result =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        String FV = scanner.nextLine();
        int fv = Integer.parseInt(FV);
        System.out.print("Enter the Second value: ");
        int sv = scanner.nextInt();
        //String SV = scanner.nextLine();
        //int sv = Integer.parseInt(SV);
        System.out.print("Enter the Operation: + / - * :");
        String Oper = scanner.next();

            // Calculator
            switch (Oper) {
                case "+" -> result = fv+sv;
                case "-" -> result = fv-sv;
                case "/" -> result = fv/sv;
                case "*" -> result = fv*sv;
                default -> System.out.println("Please choose proper operator.");
            }
        System.out.println(result);       
    }
}
