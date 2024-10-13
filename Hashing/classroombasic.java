package Hashing;
import java.util.HashMap;

public class classroombasic {
    public static void main(String[] args) {
        // create
        HashMap<String,Integer>hm = new HashMap<>();

        // insert
        hm.put("India",100);
        hm.put("China",150);
        hm.put("us",80);
        System.out.println(hm);

        //get
       int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("chile"));

        // containKey
        System.out.println(hm.containsKey("us"));
        System.out.println(hm.containsKey("chile"));

        // remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // is empty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
