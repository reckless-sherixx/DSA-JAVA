package OOPS;

public class MethodOverriding {
    public static void main(String[] args) {
        Dogss alex = new Dogss();
        alex.eat();
    }
}

class Animalss{
    void eat(){
        System.out.println("eats");
    }
}

class Dogss extends Animalss{
    void eat(){
        System.out.println("dog eats");
    }
}