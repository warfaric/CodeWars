package ArraysAndStrings;

public class SmallEnough {
    public static void main(String[] args) {
        System.out.println(smallEnough(new int[]{ 78, 117, 110, 99, 104, 117, 107, 115 }, 100));
        System.out.println(smallEnough(new int[] { 80, 117, 115, 104, 45, 85, 112, 115 }, 120));
    }
    public static boolean smallEnough(int[] a, int limit) {
        boolean flag = false;
        for(int i : a){
            if (i <= limit)
                flag = true;
            else
                return false;
        }
        return flag;
    }
}
