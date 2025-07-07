package OOPS;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog alex = new Dog();
        alex.eat();
        alex.legs = 4;
        System.out.println(alex.legs);
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

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}