package ArraysAndStrings;

public class SumOfPositive {
    public static void main(String[] args) {
        int[] testArr = {1, -4, 7, 12};
        System.out.println(sum(testArr));
    }
    public static int sum(int[] arr){
        int sum = 0;
        for(int i : arr){
            if(i > 0)
                sum += i;
        }
        return sum;
    }
}
