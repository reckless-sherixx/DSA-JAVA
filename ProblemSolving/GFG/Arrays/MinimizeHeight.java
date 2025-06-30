package ProblemSolving.GFG.Arrays;

import java.util.Arrays;

public class MinimizeHeight {
    int getMinDiff(int[] arr, int k) {
        // code here
        int len = arr.length; 
        Arrays.sort(arr);
        int diff = arr[len - 1] - arr[0];
        int smallest = arr[0] + k ;
        int largest = arr[len - 1] - k;
        for(int i = 0 ; i< len -1 ; i++){
            int min = Math.min(smallest , arr[i + 1] - k);
            int max = Math.max(largest , arr[i] + k);
            if(min < 0) continue;
            diff = Math.min(diff , max - min);
        }
        return diff;
    }
}
