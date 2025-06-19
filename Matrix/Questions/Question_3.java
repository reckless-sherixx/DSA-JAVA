package Matrix.Questions;

public class Question_3 {
    public static void transposeOfMatrix(int arr[][]) {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        transposeOfMatrix(array);
    }
}
