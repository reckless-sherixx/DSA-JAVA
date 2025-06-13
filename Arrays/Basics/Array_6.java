package Arrays.Basics;

public class Array_6 {
    public static void subArrays(int arr[]) {
        int totalSubArrayPairs = arr.length * (arr.length + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            int startNumber = i;
            for (int j = i; j < arr.length; j++) {
                int endNumber = j;
                int sumOfPairs = 0;// To calculate the sum of each pair , resets everytime the value of j changes
                for (int k = startNumber; k <= endNumber; k++) {
                    System.out.print(arr[k] + "\t");
                }
                for (int l = startNumber; l <= endNumber; l++) {
                    sumOfPairs += arr[l];
                    System.out.print("Total sum of pairs : " + sumOfPairs);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Array Pairs : " + totalSubArrayPairs);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 6, 7, 6, 8 };
        subArrays(arr);
    }
}
