package Hashmap;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,String>Capitalcities=new HashMap<>();
        Capitalcities.put("Kenya","Nairobi");
        Capitalcities.put("uganda","Kampala");
        Capitalcities.put("Tanzania","Dodoma");
        Capitalcities.put("Somalia","Mogadishu");
        Capitalcities.put("Ethopia","Adisa baba");
        Capitalcities.put("Congo","Kinsasha");
        Capitalcities.put("South","Cape town");
        System.out.println(Capitalcities);
        for (String i:Capitalcities.keySet()) {
            System.out.println(i);

        }
        System.out.println("=================================");
        for (String a:Capitalcities.values()) {
            System.out.println(a);
        }
        System.out.println("==========================");
        for (String b: Capitalcities.keySet()) {
            System.out.println("key: "+b+" Value: " + Capitalcities.get(b));
        }
    }

}
