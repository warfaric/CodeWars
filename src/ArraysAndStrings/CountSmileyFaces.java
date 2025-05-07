package ArraysAndStrings;

import java.util.*;

public class CountSmileyFaces {
    public static void main(String[] args) {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add("X-}"); a.add("xo)"); a.add(":X"); a.add(":-3"); a.add(":3");
        System.out.println(countSmileys(a));
    }
    public static int countSmileys(List<String> arr) {
        int count = 0;
        for (String s : arr) {
            if(s.length() == 2){
                if((s.charAt(0) == ':' || s.charAt(0) == ';') && (s.charAt(1) == ')' || s.charAt(1) == 'D')){
                    count++;
                }
            }
            else if(s.length() == 3){
                if((s.charAt(0) == ':' || s.charAt(0) == ';') &&
                        (s.charAt(1) == '-' || s.charAt(1) == '~') &&
                        (s.charAt(2) == ')' || s.charAt(2) == 'D')){
                    count++;
                }
            }
        }
        return count;
    }
}
