package CyclesAndPrimitives;

public class CenturyFromYear {
    public static void main(String[] args) {
        System.out.println(century(100));
    }
    public static int century(int number) {
        if(number % 100 == 0)
            return number / 100;
        else
            return number / 100 + 1;
    }
}
