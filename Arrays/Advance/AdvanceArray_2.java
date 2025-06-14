package Arrays.Advance;

// Max Sum subArray -> Prefix Aprroach ; Time Complexity : O(n^2)
public class AdvanceArray_2 {
    public static void maxSum_SubArray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        // Create a prefix array
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }

            }
        }
        System.out.println("Max Sum : " + maxSum);

    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        maxSum_SubArray(arr);
    }
}
