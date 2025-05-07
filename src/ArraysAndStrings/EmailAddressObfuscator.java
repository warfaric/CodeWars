package ArraysAndStrings;

public class EmailAddressObfuscator {
    public static void main(String[] args) {
        System.out.println(obfuscate("user_name@example.com"));
    }
    public static String obfuscate(String email) {
        StringBuilder sb = new StringBuilder();
        for(char i: email.toCharArray()) {
            if(i == '@')
                sb.append(" [at] ");
            else if (i == '.')
                sb.append(" [dot] ");
            else
                sb.append(i);
        }
        return sb.toString();
    }
}
