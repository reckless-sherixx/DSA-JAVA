package Strings;

public class Substring {
    public static String getSubString(String str, int start, int end) {
        String subString = "";
        for (int i = start; i < end; i++) {
            subString += str.charAt(i);
        }
        return subString;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.substring(2,5));
        System.out.println(getSubString(str, 2, 5));
    }
}
