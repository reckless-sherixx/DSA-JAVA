package ProblemSolving.LeetCode.Strings;

public class StringCompression {
    class Solution {
        public int compress(char[] chars) {
            int i = 0;
            int index = 0;
            while (i < chars.length) {
                int count = 0;
                char currChar = chars[i];
                while (i < chars.length && chars[i] == currChar) {
                    count++;
                    i++;
                }
                chars[index++] = currChar;

                if (count > 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[index++] = c;
                    }
                }
            }
            return index;
        }
    }
}
