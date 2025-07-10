package ProblemSolving.LeetCode.Arrays;

import java.util.Arrays;

public class MinimizeMaxPairSum {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int start = 0 ; 
        int end = nums.length - 1;
        int result = 0;
        while(start < end){
            int sum = nums[start] + nums[end];
            result = Math.max(result , sum);
            start ++ ;
            end --;
        }
        return result;
    }
}
