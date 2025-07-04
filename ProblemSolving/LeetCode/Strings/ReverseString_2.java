package ProblemSolving.LeetCode.Strings;

public class ReverseString_2 {
    public String reverseStr(String s, int k) {
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, arr.length - 1);
            reverse(arr, start, end);
        }
        return new String(arr);
    }

    void reverse(char arr[], int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
