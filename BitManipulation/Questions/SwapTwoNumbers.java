package BitManipulation.Questions;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println(x + " " + y);
    }
}
