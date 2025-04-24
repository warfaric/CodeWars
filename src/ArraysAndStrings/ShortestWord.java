package ArraysAndStrings;

public class ShortestWord {
    public static void main(String[] args) {
        System.out.println(findShort("bighjhgj take       over the wo maybe who knows perhaps"));
    }
    public static int findShort(String s) {
        String[] words = s.split("\\s+");
        int temp = 100000;
        for(String word : words){
            if(word.length() < temp){
                temp = word.length();
            }
        }
        return temp;
    }
}
