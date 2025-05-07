package ArraysAndStrings2;

import java.util.Arrays;

public class EqualSidesOfArray {
    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[] {1,2,3,4,3,2,1}));
        System.out.println(findEvenIndex(new int[]{20,10,-80,10,10,15,35}));
        System.out.println(findEvenIndex(new int[]{2, -2, 3, -1, -2, 10}));
        System.out.println(findEvenIndex(new int[] {1,2,3,4,5,6}));
    }
    public static int findEvenIndex(int[] arr) {
        if(Arrays.stream(arr).skip(1).sum() == 0){
            return 0;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (Arrays.stream(arr, 0, i).sum() ==
                    Arrays.stream(arr, i + 1, arr.length).sum())
                return i;
        }
        if (Arrays.stream(arr, 0, arr.length - 1).sum() == 0) {
            return arr.length - 1;
        }
        return -1;

    }
}
