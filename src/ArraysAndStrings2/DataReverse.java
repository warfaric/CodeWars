package ArraysAndStrings2;

import java.util.*;

public class DataReverse {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dataReverse(new int[] {0,1,0,1,0,1,0,1,1,0,1,0,1,0,1,0})));
    }
    public static int[] dataReverse(int[] data) {
        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            temp.add(data[i]);
        }
        int index1 = temp.size() - 8;
        int index2 = temp.size();
        int[] result = new int[data.length];
        while (index1 >= 0) {
            list.addAll(temp.subList(index1, index2));
            index1 -= 8;
            index2 -= 8;
        }
        System.out.println(temp);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
