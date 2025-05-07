package ArraysAndStrings2;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1,2,3}, 4)));
        System.out.println(Arrays.toString(twoSum(new int[]{1234,5678,9012}, 14690)));
        System.out.println(Arrays.toString(twoSum(new int[]{2,2,3}, 4)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target && i != j) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
