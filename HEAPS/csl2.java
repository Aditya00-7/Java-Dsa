package HEAPS;

import java.util.PriorityQueue;

public class csl2 {

     static class Student implements Comparable<Student>{
            String name;
            int rank;
            public Student(String name,int rank){
                this.name=name;
                this.rank=rank;
            }

            @Override
            public int compareTo(Student s2){
                return this.rank- s2.rank;
            }

        }


        public static void main(String[] args) {
            PriorityQueue<Student> pq = new PriorityQueue<>();


            pq.add(new Student("A",4));
            pq.add(new Student("B",6));
            pq.add(new Student("c",8));
            pq.add(new Student("d",7));
            pq.add(new Student("e",5));
            pq.add(new Student("f",9));


            while (!pq.isEmpty()){
                System.out.println(pq.peek().name+"->"+pq.peek().rank);
                pq.remove();
            }

        }
}
