package CyclesAndPrimitives;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }
    public static String evenOrOdd(int number) {
        if(number % 2 == 0)
            return "Even";
        else
            return "Odd";
    }
}
