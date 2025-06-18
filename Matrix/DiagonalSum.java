package Matrix;

public class DiagonalSum {
    public static void diagonalSum(int arr[][]) {
        int sum = 0;
        // Time complexity : O(n^2)
        // for (int i = 0; i < arr.length; i++) {   
        //     for (int j = 0; j < arr[0].length; j++) {
        //         if (i == j) {
        //             sum += arr[i][j];
        //         } else if (i + j == arr.length - 1) {
        //             sum += arr[i][j];
        //         }
        //     }
        // }
        for(int i = 0 ; i<arr.length ; i++){ //Time complexity : O(n)
            sum+=arr[i][i];
            if(i!=arr.length - i -1){
                sum+=arr[i][arr.length-i-1];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 10, 11 },
        };
        diagonalSum(arr);
    }
}
