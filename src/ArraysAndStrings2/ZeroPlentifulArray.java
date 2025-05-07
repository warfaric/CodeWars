package ArraysAndStrings2;

public class ZeroPlentifulArray {
    public static void main(String[] args) {
        System.out.println(zeroPlentifulArray(new int[] {0, 0, 0, 0, 0, 1}));
        System.out.println(zeroPlentifulArray(new int[] {0, 0, 0, 0, 1, 0, 0, 0, 0}));
        System.out.println(zeroPlentifulArray(new int[] {0, 0, 0, 0, 1, 0}));
        System.out.println(zeroPlentifulArray(new int[] {0, 0, 0, 1, 0, 0}));
        System.out.println(zeroPlentifulArray(new int[] {1, 0, 0, 0, 0}));
        System.out.println(zeroPlentifulArray(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0}));
    }
    public static int zeroPlentifulArray(int[] arr) {
        int count = 0;
        int temp = 0;
        boolean flag = true;
        for(int i : arr){
            if(i == 0){
                temp++;
            }
            else {
                temp = 0;
                flag = true;
            }
            if(temp == 4 && flag) {
                count++;
                flag = false;
            }

        }
        return count;
    }
}
