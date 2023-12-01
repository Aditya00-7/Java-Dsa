package OOPS;

public class Oops {
    public static void main(String args []){
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);
        Student s1 = new Student("Shradha");
        System.out.println(s1.name);
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