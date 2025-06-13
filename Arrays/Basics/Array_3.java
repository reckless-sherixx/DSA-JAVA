package Arrays.Basics;

//Binary Search(Time Complexity : O(log n))
public class Array_3 {
    public static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 7, 9, 10 };
        int target = binarySearch(arr, 4);
        System.out.println("Target Found at Index : " + target);
    }
}
