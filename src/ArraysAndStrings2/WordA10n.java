package ArraysAndStrings2;

public class WordA10n {
    public static void main(String[] args) {

    }
    public String abbreviate(String string) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char[] chars = string.toCharArray();
        sb.append(chars[0]);
        for(int i = 1; i < chars.length; i++) {
            count++;
            if(chars[i] == ' ') {
                sb.append(count).append(chars[i - 1]);
            }
        }
        return null;
    }
}
