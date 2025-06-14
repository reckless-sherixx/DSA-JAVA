package Arrays.Advance;

//Max sum subArray -> Brute Force(Bad Method) ; Time complexity : O(n^3)
public class AdvanceArray_1 {
    public static void maxSum_SubArray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i + 1; j < arr.length; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum += arr[k];
                }
                System.out.print("The sum of the pair :" +currentSum + "\t");
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
                System.out.println();
            }
        }
        System.out.println("The max sum : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1,-2 , 6 , -1 , 3};
        maxSum_SubArray(arr);
    }
}
