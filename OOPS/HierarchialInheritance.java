package OOPS;

public class HierarchialInheritance{
    public static void main(String[] args) {
        Dogs alex = new Dogs();
        Mammals elephant = new Mammals();
        alex.eat();
        elephant.breathe();        
    }
}

class Animals{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}

class Mammals extends Animals{
    int legs;
}

class Dogs extends Animals{
    String breed;
}