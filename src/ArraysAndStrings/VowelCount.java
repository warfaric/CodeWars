package ArraysAndStrings;

public class VowelCount {
    public static void main(String[] args) {
        System.out.println(getCount("o a kak ushakov lil vo kashu kakao"));
    }
    public static int getCount(String str) {
        char[] letter = str.toCharArray();
        int count = 0;
        for(char i : letter) {
            if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                count++;
            }
        }
        return count;
    }
}
