package Hashmap;

import java.util.HashMap;

public class hashmapinteger {
    public static void main(String[] args) {
        HashMap<String, Integer>people=new HashMap<>();
        people.put("Mohamed",20);
        people.put("malyun",21);
        people.put("Abdi",20);
        people.put("Fardosa",19);
        people.put("Fadumo",22);
        people.put("Ubah",6);
        people.put("mohamud",8);
        for (String i: people.keySet()) {
            System.out.println("key:"+i+" value: "+people.get(i));
        }


    }
}
