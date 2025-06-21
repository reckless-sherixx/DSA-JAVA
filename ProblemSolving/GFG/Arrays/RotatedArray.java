package ProblemSolving.GFG.Arrays;

public class RotatedArray {
    static void rotateArr(int arr[], int d) {
        int len = arr.length;
        d = d % len; // to check if the no of rotation exceeds the len of the array
        // reverse the array from 0 to d
        reverse(arr, 0, d - 1);
        // reverse the arr from d to len
        reverse(arr, d, len - 1);
        // reverse the arr from 0 to len
        reverse(arr, 0, len - 1);

    }

    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
