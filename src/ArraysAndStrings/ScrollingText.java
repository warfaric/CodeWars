package ArraysAndStrings;

import java.util.Arrays;

public class ScrollingText {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(scrollingText("codewars")));
    }
    public static String[] scrollingText(String text) {
        String[] result = new String[text.length()];
        char[] characters = text.toCharArray();
        int index = 0;
        char temp;
        result[index] = text.toUpperCase();
        index++;
        while(index != text.length()){
            temp = characters[0];
            for(int i = 0; i < characters.length - 1; i++){
                characters[i] = characters[i + 1];
            }
            characters[characters.length - 1] = temp;
            result[index] = String.valueOf(characters).toUpperCase();
            index++;
        }
        return result;
    }
}
