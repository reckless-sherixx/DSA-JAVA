package Arrays.Advance;

//Max Sum subArray -> Kadane's Approach(Best method) ; Time complexity : O(n)
public class AdvanceArray_3 {
    public static void maxSum_SubArray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int smallestNumber = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        //Exception condition if all the numbers in the array are negative , then just print the biggest number among the negative number
        if (maxSum == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (smallestNumber < arr[i]) {
                    smallestNumber = arr[i];
                }
                maxSum = smallestNumber;
            }
        }
        System.out.println("Max Sum : " + maxSum);

    }

    public static void main(String[] args) {
        int arr[] = { -1, -2, -3, -4 };
        maxSum_SubArray(arr);
    }
}
