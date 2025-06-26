package ProblemSolving.LeetCode.Random;

public class CheckPalindrom {
    public boolean isPalindrome(int x) {
        int originalNum = x;
        int reverse = 0;
        while (x > 0) {
            int temp = x % 10;
            reverse = reverse * 10 + temp;
            x = x / 10;
        }
        if (reverse == originalNum) {
            return true;
        }
        return false;
    }
}
