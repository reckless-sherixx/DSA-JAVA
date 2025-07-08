package OOPS;

public class Abstraction{
    public static void main(String[] args) {
        Horse mustang = new Horse();
        mustang.eat();
    }
}

abstract class Animalsss{
    String color;
    Animalsss(){
        color = "brown";
    }
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}

class Horse extends Animalsss{
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Horse walks");
    }
}