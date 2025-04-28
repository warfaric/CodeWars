package ArraysAndStrings;

import java.util.*;

public class ArrayDiff {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2}, new int[] {1})));
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2,2}, new int[] {1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{2})));
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2,2}, new int[] {})));
        System.out.println(Arrays.toString(arrayDiff(new int [] {}, new int[] {1,2})));
        System.out.println(Arrays.toString(arrayDiff(new int [] {1}, new int[] {4,1,6})));
        System.out.println(Arrays.toString(arrayDiff(new int [] {0,-12,20,1,20,-15,15,-8,-19,-19,1,2,3,17,-3,-5,19,-16,-18},
                new int[] {0,-12,20,1,20,-15,15,-8,-19,-19,1,2,3,17,-3})));
    }
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> setA = new ArrayList<>();
        List<Integer> setB = new ArrayList<>();

        for(int i : a){
            setA.add(i);
        }
        for(int i : b){
            setB.add(i);
        }

        setA.removeAll(setB);
        return setA.stream().mapToInt(i -> i).toArray();

    }
}
