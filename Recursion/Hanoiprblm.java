package Recursion;

public class Hanoiprblm {
    static void towerofHanoi( int n, char from_rod, char to_rod,char aux_rod){
        // base case
        if (n==0){
            return;
        }
        // move n-1 disk from rod a (from_rod) to rod b (aux_rod).
        towerofHanoi(n-1,from_rod,aux_rod,to_rod);

        // move nth disk from rod a(from_rod) to ros c (to_rod)
        System.out.println("move disk  "+ n +"from rod "+ from_rod +"to rod "+to_rod);


        // move n-1 disk from rod b (aux_rod) to rod c (to_rod)
        towerofHanoi(n-1,aux_rod,to_rod ,from_rod);
    }
    public static void main(String[] args) {
        towerofHanoi(4,'A','B','C');


    }

}
