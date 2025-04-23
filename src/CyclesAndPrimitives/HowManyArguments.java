package CyclesAndPrimitives;

import java.util.Arrays;

public class HowManyArguments {
    public static void main(String[] args) {
        System.out.println(countArgs('a', 'b'));
    }
    public static int countArgs(Object... args) {
        return args.length;
    }
}
