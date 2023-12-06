package OOPS;

public class Oops {
    public static void main(String args []){
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);
        Student s1 = new Student("Shradha");
        System.out.println(s1.name);

        Horse h = new Horse();
        h.eat();
        h.walk();

        Chiken c = new Chiken();
        c.eat();
        c.walk();
    }
    }

class Student{
    String name;
    int roll;
    Student(String name){
        this.name= name;
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
