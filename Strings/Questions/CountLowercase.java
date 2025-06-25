package Strings.Questions;

public class CountLowercase {
    public static int countLowercase(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == Character.toLowerCase(str.charAt(i))){
                sb.append(str.charAt(i));
            }
        }
        return sb.length();
    }
    public static void main(String[] args) {
        String str = "AgggsdjQW";
        System.out.println(countLowercase(str));
    }
}
