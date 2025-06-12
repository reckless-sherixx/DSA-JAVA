package Patterns.Advance;

public class AdvancePattern_2 {
    public static void invertedHalfPyramid(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedHalfPyramid(4);
    }
}
