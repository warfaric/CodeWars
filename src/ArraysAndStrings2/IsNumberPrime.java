package ArraysAndStrings2;

import java.math.BigInteger;

public class IsNumberPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));
        System.out.println(isPrime(10));
        System.out.println(isPrime(5099));
        System.out.println(isPrime(45));
        System.out.println(isPrime(-5));
    }
    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        return BigInteger.valueOf(num).isProbablePrime(20);
    }
}
