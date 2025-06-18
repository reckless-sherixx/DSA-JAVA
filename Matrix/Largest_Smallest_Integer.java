package Matrix;

import java.util.*;
public class Largest_Smallest_Integer {
    public static void largest(int arr[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                largest = Math.max(largest , arr[i][j]);
            }
        }
        System.out.println("The largest number is :" + largest);
    }
    
    public static void smallest(int arr[][]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                smallest = Math.min(smallest , arr[i][j]);
            }
        }
        System.out.println("The largest number is :" + smallest);
    }
    

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        //Input
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        largest(arr);
        smallest(arr);
    }
}
