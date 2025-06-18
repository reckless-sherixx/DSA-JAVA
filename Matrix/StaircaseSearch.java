package Matrix;

public class StaircaseSearch {
    public static boolean staircaseSearch(int arr[][], int key) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("(" + row + "," + col + ")");
                return true;
            } else if (arr[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        staircaseSearch(arr, 33);
    }
}
