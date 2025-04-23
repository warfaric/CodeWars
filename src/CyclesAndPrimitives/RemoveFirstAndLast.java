package CyclesAndPrimitives;

public class RemoveFirstAndLast {
    public static void main(String[] args) {
        System.out.println(remove("1234567"));
    }
    public static String remove(String str) {
        String sb = new StringBuilder(str).deleteCharAt(str.length() - 1)
                .deleteCharAt(0).toString();
        return sb;
    }
}
