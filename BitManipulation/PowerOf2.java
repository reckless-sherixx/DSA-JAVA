package BitManipulation;

public class PowerOf2 {
    public static boolean powerOf2(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(powerOf2(3));
    }
}
