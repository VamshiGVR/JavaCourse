
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 

public class DateTimeFormatterr {
    public static void main(String[] args) {
        LocalDateTime NormDT = LocalDateTime.now();
        System.out.println("Normal Date: "+ NormDT);
        DateTimeFormatter FormatteDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String DatedFormated = NormDT.format(FormatteDate);
        System.out.println("Formatted Date: " + DatedFormated);
    }
}
