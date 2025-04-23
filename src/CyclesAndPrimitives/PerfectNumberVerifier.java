package CyclesAndPrimitives;

public class PerfectNumberVerifier {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(4986));
    }
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }
        if(sum == num)
            return true;
        else
            return false;
    }
}
