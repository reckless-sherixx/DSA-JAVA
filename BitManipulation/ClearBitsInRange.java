package BitManipulation;

public class ClearBitsInRange {
    public static int clearIBits(int i, int j, int n) {
        int a = (~0) << (j + 1); // To get 1's
        int b = (1 << i) - 1; // To get 0's
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIBits(7, 2, 14));
    }
}
