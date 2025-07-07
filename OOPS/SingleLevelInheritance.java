package OOPS;

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Fish tuna = new Fish();
        tuna.eat();
    }
}

// Parent class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

// Derived class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims");
    }
}
