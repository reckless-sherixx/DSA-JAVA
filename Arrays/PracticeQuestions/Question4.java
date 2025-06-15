package Arrays.PracticeQuestions;

public class Question4 {
    public static int trapped_Water(int arr[]) {
        int len = arr.length;
        int leftMax[] = new int[len];
        leftMax[0] = arr[0];
        for (int i = 1; i < len; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        int rightMax[] = new int[len];
        rightMax[len - 1] = arr[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }
        int trappedWater = 0;
        for (int i = 0; i < len; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - arr[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trapped_Water(arr));
    }
}
