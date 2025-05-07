package ArraysAndStrings2;

import java.util.Arrays;
import java.util.Comparator;

public class LengthOfMissingArray {
    public static void main(String[] args) {
        System.out.println(getLengthOfMissingArray(new Object[][] { new Object[] { 1, 2 },
                new Object[] { 4, 5, 1, 1 }, new Object[] { 1 }, new Object[] { 5, 6, 7, 8, 9 }}));
        System.out.println(getLengthOfMissingArray(new Object[][] { new Object[] { 5, 2, 9 },
                new Object[] { 4, 5, 1, 1 }, new Object[] { 1 }, new Object[] { 5, 6, 7, 8, 9 }}));
        System.out.println(getLengthOfMissingArray(new Object[][] { new Object[] { null },
                new Object[] { null, null, null } }));
        System.out.println(getLengthOfMissingArray(new Object[][] { }));
        System.out.println(getLengthOfMissingArray(new Object[][] {new Object[] { 4, 5, 1, 1 },
                new Object[] { 1, 2 ,3 }, new Object[] { 5, 6, 7, 8, 9 ,10 }}));
        System.out.println(getLengthOfMissingArray(new Object[][] {new Object[] { },
                new Object[] { 1 }, new Object[] { 5, 6, 7, }}));
        System.out.println(getLengthOfMissingArray(new Object[][] {new Object[] { 0, 3, 3, 4, 2, 4 },
                new Object[] { 0, 1, 3, 2, 1, 2, 4 }, new Object[] { 0, 1, 2, 1 }}));
        System.out.println(getLengthOfMissingArray(new Object[][] {null,null,null}));
        System.out.println(getLengthOfMissingArray(new Object[0][] ));

    }
    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        if(arrayOfArrays == null || arrayOfArrays.length == 0 || arrayOfArrays[0] == null){
            return 0;
        }
        Object[][] sortedArrayOfArrays = Arrays.stream(arrayOfArrays).filter(arr -> arr != null)
                .sorted(Comparator.comparingInt(arr -> arr == null ? 0 : arr.length))
                .toArray(Object[][]::new);
        int min = sortedArrayOfArrays[0].length;
        if(min == 0)
            return 0;
        for(int i = 0; i < sortedArrayOfArrays.length; i++) {
            if(sortedArrayOfArrays[i].length != min)
                return min;
            min++;
        }
        return 0;
    }
}
