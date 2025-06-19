package Matrix.Questions;

public class Question_2 {
    public static void calculateSum(int arr[][]) {
        int row = 1;
        int col = 0;
        int sum = 0;
        while (col < arr[0].length) {
            sum += arr[row][col];
            col++;
        }
        System.out.println(" The Sum : " + sum);
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        calculateSum(arr);
    }
}
