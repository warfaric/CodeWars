package ArraysAndStrings2;

import java.util.Arrays;

public class FormatWordsIntoSentence {
    public static void main(String[] args) {
        System.out.println(formatWords(new String[] {"one", "two", "", "three", "four"}));
        System.out.println(formatWords(new String[] {}));
        System.out.println(formatWords(null));
        System.out.println(formatWords(new String[] {""}));
        System.out.println(formatWords(new String[] {"", "", "three"}));
        System.out.println(formatWords(new String[] {"one"}));
        System.out.println(formatWords(new String[] {"one", "", "three"}));
    }
    public static String formatWords(String[] words) {
        StringBuilder sb = new StringBuilder();
        boolean isAdded = false;
        if (words == null || words.length == 0)
            return "";
        words = Arrays.stream(words).filter(s -> !s.isEmpty()).toArray(String[]::new);
        for(int i = 0; i < words.length; i++) {
            if(i == words.length - 1 && isAdded) {
                sb.append(" and ");
                sb.append(words[i]);
                break;
            }
            else if( !(words[i] == null) ) {
                sb.append(words[i]);
                if (i != words.length - 2 && words.length > 1)
                    sb.append(", ");
                isAdded = true;
            }
        }
        return sb.toString();
    }
}
