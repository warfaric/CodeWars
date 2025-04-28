package ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCapitals {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(capitals("sadSAD")));
        System.out.println(Arrays.toString(capitals("CodEWaRs")));
    }
    public static int[] capitals(String s){
        List<Integer> capitals = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i)))
                capitals.add(i);
        }
        return capitals.stream().mapToInt(i -> i).toArray();
    }
}
