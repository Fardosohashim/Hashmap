package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

// write a java program hashmap 30 country and their population in Africa and make dynamic for user input for the counry and for the population
public class countryandpopulation {
    public static boolean F(HashMap<Integer, String> county, String UserInput) {
        boolean F = false;
        for (Integer i : county.keySet()) {
            if (UserInput.equals(county.get(i))) {
                System.out.println("the country: "+ county.get(i) + " population " + i);
                F = true;
                break;
            }

        }
        return F;

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap< Integer, String> country=new HashMap<>();
        System.out.println("Enter a country");
        String C= sc.nextLine().toLowerCase();

        country.put(206139589, "nigeria");
        country.put(114963588, "ethopia");
        country.put(102334404, "egypt");
        country.put(89561403, "congo");
        country.put(59308690, "south Africa");
        country.put(59734218, "tanzania");
        country.put(53771296, "kenya");
        country.put(45741007, "uganda");
        country.put(43851044, "algeria");
        country.put(43849260, "sudan");
        country.put(36910560, "morocco");
        country.put(320772940, "angola");
        country.put(310072940, "ghana");
        country.put(31255435, "mozambique");
        country.put(27691018, "madagascar");
        country.put(26545863, "cameroon");
        country.put(26378274, "cote dIvorire");
        country.put(24206644, "niger");
        country.put(20903273, "burkina Faso");
        country.put(20250833, "mali");
        country.put(19129952, "malawi");
        country.put(16743927, "senegal");
        country.put(16425864, "chad");
        country.put(15893222, "somalia");
        country.put(14862924, "zimbabwe");
        country.put(13132795, "Guinea");
        country.put(12952218, "rwanda");
        country.put(12123200, "benin");
        country.put(11818619, "tunisia");

       if(F(country,C)){
            System.out.println(" the county is found");

        }
        else{
            System.out.println("The county is not found");
        }

    }
}
