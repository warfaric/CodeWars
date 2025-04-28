package ArraysAndStrings;

import java.util.Arrays;

public class RowWeights {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rowWeights(new int[]{13, 27, 49})));
    }
    public static int[] rowWeights (final int[] weights) {
        int[] result = new int[]{0, 0};
        for (int i = 0; i < weights.length; i++) {
            if(i % 2 == 0)
                result[0] += weights[i];
            else
                result[1] += weights[i];
        }
        return result;
    }
}
