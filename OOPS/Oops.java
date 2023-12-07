package OOPS;

public class Oops {
    public static void main(String args []){
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);
        Student s1 = new Student("Shradha");
        System.out.println(s1.name);
        s1.schoolName = "jmv";
        Student s2 =new Student("ash");
        System.out.println(s2.schoolName);
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chiken c = new Chiken();
        c.eat();
        c.walk();
        Queen q= new Queen();
        q.moves();
    }
}

class Student{
    String name;
    int roll;
    static String schoolName;
    Student(String name){
        this.name= name;
   }
    void setName(String Name){
        this.name =name;
    }
    String getName(){
        return this.name;
    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip =newTip;
    }
}
abstract class Animal{
    void eat(){
        System.out.println("animal Eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        super();
        System.out.println("horse constructor is called");
    }
    @Override
    void walk() {
        System.out.println("walks on 4 legs");
    }
}
class Chiken extends Animal{
    @Override
    void walk() {
        System.out.println("walks on 2 legs");
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    @Override
    public void moves() {
        System.out.println("up,down,left,right,diagonal(all 4 direction)");
    }
}
class rook implements ChessPlayer{
    @Override
    public void moves() {
        System.out.println("up,down,left,right");
    }
}