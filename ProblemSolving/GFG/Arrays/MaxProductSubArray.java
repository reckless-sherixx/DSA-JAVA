package ProblemSolving.GFG.Arrays;

public class MaxProductSubArray {
    int maxProduct(int[] arr) {
        // code here
        int currMax = arr[0];
        int Max = arr[0];
        int currMin = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = currMax;
            currMax = Math.max(arr[i], Math.max(currMax * arr[i], currMin * arr[i]));
            currMin = Math.min(arr[i], Math.min(temp * arr[i], currMin * arr[i]));
            Max = Math.max(Max, currMax);
        }
        return Max;
    }
}
