import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        String FV = scanner.nextLine();
        int fv = Integer.parseInt(FV);
        System.out.println("Enter the first value: ");
        String SV = scanner.nextLine();
        int sv = Integer.parseInt(SV);

        int result = fv + sv;
        System.out.println(result);       
    }
}
