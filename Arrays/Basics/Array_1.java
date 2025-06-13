package Arrays.Basics;

//Linear Search(Time Complexity : O(n))
public class Array_1 {
    public static int linearSearch(int numbers[], int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = { 1, 5, 6, 7, 8, 2, 4 };
        int key = 7;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found the target at index : " + index);
        }
    }
}