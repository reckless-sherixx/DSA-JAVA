package Arrays.PracticeQuestions;

public class Question1 {
    public static boolean isRepeated(int arr[]) {
        boolean isRepeated = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isRepeated = true;
                }
            }

        }
        return isRepeated;
    }

    public static void main(String[] args) {
        int nums[] = { 1 , 2 , 3 , 1};
        System.out.println(isRepeated(nums));
    }
}
