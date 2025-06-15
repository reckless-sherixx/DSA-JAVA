package Arrays.PracticeQuestions;

public class Question5 {
    public static void tripletSum(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum == 0) {
                        System.out.print("[" + arr[i] + "," + arr[j] + "," + arr[k] + "]");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        tripletSum(arr);
    }
}
