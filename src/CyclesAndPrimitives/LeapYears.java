package CyclesAndPrimitives;

public class LeapYears {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2015));
    }
    public static boolean isLeapYear(int year) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        else
            return false;
    }
}
