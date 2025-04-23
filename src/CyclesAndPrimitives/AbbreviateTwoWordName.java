package CyclesAndPrimitives;

public class AbbreviateTwoWordName {
    public static void main(String[] args) {
        System.out.println(abbrevName("Samer Harris"));
    }
    public static String abbrevName(String name) {
        char s = name.charAt(name.indexOf(" ") + 1);
        char f = name.charAt(0);
        String abbrev = f + ". " + s;

        return abbrev.toUpperCase();
    }
}
