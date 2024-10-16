package Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Linkedhashmap {

    public static void main(String[] args) {
        LinkedHashMap<String,Integer>lhm= new LinkedHashMap<>();
        lhm.put("india",180);
        lhm.put("chile",50);
        lhm.put("us",90);

        HashMap<String,Integer>hm =new HashMap<>();
        hm.put("india",100);
        hm.put("chile",150);
        hm.put("us",90);
        System.out.println(hm);
        System.out.println(lhm);
    }
}
