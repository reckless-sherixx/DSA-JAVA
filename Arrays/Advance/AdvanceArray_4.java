package Arrays.Advance;

public class AdvanceArray_4 {
    // Trapping Rainwater problem ; Time Complexity : O(n)
    public static int trapping_Rainwater(int height[]) {
        int len = height.length;
        // Calculate left max boundary
        int leftMax[] = new int[len];
        leftMax[0] = height[0];
        for (int i = 1; i < len; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // Calculate right max boundary
        int rightMax[] = new int[len];
        rightMax[len - 1] = height[len - 1];
        for (int i = len - 2; i <= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i - 1]);
        }

        int trappedWater = 0;

        for (int i = 0; i < len; i++) {
            // Calculate water level
            int waterLevel = Math.min(rightMax[i], leftMax[i]);

            // Calculate trapped water
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trapping_Rainwater(height));
    }
}
