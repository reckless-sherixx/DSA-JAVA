package BasicSorting;

import java.util.*;

//Time Complexity O(n log n )
public class InBuiltSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        Integer array[] = { 1, 2, 3, 5, 4 };
        // sorting ascending order
        Arrays.sort(arr);
        // sorting descending order
        Arrays.sort(array, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
