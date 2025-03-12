public class SwitchCase{
    public static void main(String[] args){
        int a= 3;
        String day;

            //New Method
        day = switch (a) {
            case 1 -> "Boring Day";
            case 2 -> "Normal Day";
            case 3 -> "Lucky Day";
            default -> "Bad Day";
        };
        System.out.println(day);
        
            /*Old Method
        switch (a) {
            case 1:
                day = "Boring Day";
                break;
            case 2:
                day = "Normal Day";
                break;
            case 3:
                day = "Lucky Day";
                break;
            default:
                day = "Bad Day";
        }
        System.out.println(day);*/
    } 
}