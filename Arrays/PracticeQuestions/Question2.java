package Arrays.PracticeQuestions;

public class Question2 {
    public static int searchTarget(int arr[], int target) {
        // Find the min index in order to use binary search
        int min = minIndex(arr);
        // find the target in the sorted left
        if (arr[min] <= target && target <= arr[arr.length - 1]) {
            return binarySearch(arr, min, arr.length - 1, target);
        }
        // find the target in the sorted right
        else {
            return binarySearch(arr, 0, min, target);
        }

    }

    // Function to find the target using binary search
    public static int binarySearch(int arr[], int start, int end, int target) {
        int left = start;
        int right = end;

        while (left <= end) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int minIndex(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                return mid;
            } else if (arr[start] <= arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(searchTarget(arr, 10));
    }
}
