package ArraysAndStrings;

public class SmallestValueArray {
    public static void main(String[] args) {
        System.out.println(findSmallest(new int[] {5, 4, 3, 2, 1}, "index"));
    }
    public static int findSmallest(int[] numbers, String mode) {
        int min = numbers[0];
        int index = 0;
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
                index = i;
            }
        }
        if(mode.equals("value"))
            return min;
        else if (mode.equals("index"))
            return index;
        else
            return -1;
    }
}
