package CyclesAndPrimitives;

public class CreditCardMask {
    public static void main(String[] args) {
        System.out.println(maskify(""));
    }
    public static String maskify(String str) {
        if(str.length() > 4) {
            StringBuilder sb = new StringBuilder(str);
            for (int i = 0; i < str.length() - 4; i++) {
                sb.replace(i, i + 1, "#");
            }

            return sb.toString();
        }
        else
            return str;

    }

}
