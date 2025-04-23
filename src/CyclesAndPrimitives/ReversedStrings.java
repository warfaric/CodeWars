package CyclesAndPrimitives;

public class ReversedStrings {
    public static void main(String[] args) {
        System.out.println(solution("world"));
    }
    public static String solution(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return reversed;
    }
}
