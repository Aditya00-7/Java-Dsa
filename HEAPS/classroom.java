package HEAPS;
import java.util.PriorityQueue;

public class classroom {


    public static void main(String[] args) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();

        // comparator.reverserorder use to change from assending order to desecding order
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);
        pq.add(-1);

        while (!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}
