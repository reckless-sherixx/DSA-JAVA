package Matrix.Questions;

public class Question_1 {
    public static void findNumber(int arr[][]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("Output : " + count);
    }

    public static void main(String[] args) {
        int arr[][] = { { 4, 7, 8 }, { 7, 8, 7 } };
        findNumber(arr);
    }
}
