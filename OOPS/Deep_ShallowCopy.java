package OOPS;

public class Deep_ShallowCopy {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.name = "Vidyansh";
        s1.roll = 23;
        s1.password = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 40;
        s1.marks[2] = 60;

        Student2 s2 = new Student2(s1); // copy
        s1.marks[2] = 30;
        s2.password = "xyz";

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student2 {
    String name;
    int roll;
    String password;
    int marks[];

    // Shallow copy constructor
    // Student2(Student2 s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;
    // }

    // Deep copy constructor
    Student2(Student2 s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student2() {
        System.out.println("Constructor is being called");
        marks = new int[3];
    }

    Student2(String name) {
        this.name = name;
    }

    Student2(int roll) {
        this.roll = roll;
    }
}