package Arrays.Basics;

//Time complexity : O(n^2)
public class Array_5 {
    public static void printPairs(int arr[]) {
        int totalPairs = arr.length*(arr.length-1)/2; //Important formula for better time complexity
        for (int i = 0; i < arr.length; i++) {
            int currentNumber = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + currentNumber + "," + arr[j] + ")");
            }
            System.out.println();
        }
        System.out.println("Total Pairs :" + totalPairs);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 7, 9, 10 };
        printPairs(arr);
    }
}
