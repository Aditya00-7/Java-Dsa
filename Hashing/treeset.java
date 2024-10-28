package Hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("mumbai");
        cities.add("Noida");
        cities.add("Goa");
        System.out.println(cities);

        LinkedHashSet<String>lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Goa");
        lhs.add("Noida");
        System.out.println(lhs);

        TreeSet<String>ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Goa");
        ts.add("Noida");
        System.out.println(ts);

    }
}
