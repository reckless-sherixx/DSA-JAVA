package ProblemSolving.GFG.Arrays;

public class MaxSumSubArray{
    int maxSubarraySum(int[] arr) {
        // Your code here
       int smallest = Integer.MIN_VALUE;
       int maxSum = Integer.MIN_VALUE;
       int currentSum = 0;
       for(int i = 0 ; i<arr.length ; i++){
           currentSum += arr[i];
          
          if(currentSum < 0){
              currentSum = 0 ;
          }
          maxSum = Math.max(maxSum , currentSum);
       }
       if(maxSum == 0){
           for(int i = 0 ; i<arr.length ; i++){
               smallest = arr[i];
           }
           maxSum = smallest;
       }
       return maxSum;
    }
}