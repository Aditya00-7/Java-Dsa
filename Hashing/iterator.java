package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class iterator {
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Goa");
        cities.add("greater noida");

        Iterator it = cities.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (String city : cities){
            System.out.println(city);
        }
    }
}
