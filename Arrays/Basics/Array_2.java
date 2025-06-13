package Arrays.Basics;

public class Array_2 {
    public static int largestNumber(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int smallestNumber(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 10, 3, 9 };
        int largest = largestNumber(arr);
        int smallest = smallestNumber(arr);
        System.out.println("The largest number is :" + largest);
        System.out.println("The largest number is :" + smallest);
    }
}
