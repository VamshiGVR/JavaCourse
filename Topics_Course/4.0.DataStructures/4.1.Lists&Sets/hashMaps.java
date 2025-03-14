
import java.util.HashMap;

public class hashMaps {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("Amr", "AP");
        capitalCities.put("Che", "TN");
        capitalCities.put("Bang", "KR");
        capitalCities.put("Mum", "MH");
        capitalCities.put("Kol", "WB");
        capitalCities.put("Hyd", "TR");
        System.out.println(capitalCities);
        System.out.println();

        //Get
        System.out.println(capitalCities.get("Amr"));
        System.out.println();

        //Remove
        capitalCities.remove("Amr");
        System.out.println(capitalCities);
        System.out.println();

        //Size
        System.out.println(capitalCities.size());
        System.out.println();
        
        //Print Keyvalues
        for(String i : capitalCities.values())
        System.out.println(i+'\n');
        
        //Print Keysets
        for(String i : capitalCities.keySet())
        System.out.println(i);

        // Print keyvalues & Keysets
        for(String i : capitalCities.keySet())
        System.out.println("key: " + i + " " + "Values: "+ capitalCities.get(i)+'\n');
        
        //Clear
        capitalCities.clear();
        System.out.println(capitalCities);

        // DO HAshMap -> Int & String
    }
}
