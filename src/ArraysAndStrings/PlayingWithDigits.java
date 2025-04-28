package ArraysAndStrings;
import java.util.*;
import java.math.*;

public class PlayingWithDigits {
    public static void main(String[] args) {
        System.out.println(digPow(46288, 3));
    }
    public static long digPow(int n, int p) {
        int sum = 0;
        List<Integer> digitsList= new ArrayList<>(n);
        int p2 = p;
        int n2 = n;
        while (n2 > 0) {
            digitsList.add(n2 % 10);
            n2 /= 10;
        }
        Collections.reverse(digitsList);
        for (Integer digit : digitsList) {
            sum += Math.pow(digit, p2);
            p2++;
        }
        if(sum % n == 0)
            return sum / n;
        else
            return -1;
    }
}
