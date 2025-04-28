package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InsertDashes {
    public static void main(String[] args) {
        System.out.println(insertDash(12345));
        System.out.println(insertDash(33345633));
    }
    public static String insertDash(int num) {
        StringBuilder result = new StringBuilder();
        List<Integer> digits = new ArrayList<>(Integer.toString(num).chars()
                .map(c -> c - '0').boxed().collect(Collectors.toList()));
        for (int i = 0; i < digits.size() - 1; i++) {
            if(digits.get(i) % 2 != 0 && digits.get(i + 1) % 2 != 0) {
                result.append(digits.get(i));
                result.append("-");
            }
            else
                result.append(digits.get(i));
        }
        result.append(digits.get(digits.size() - 1));
        return result.toString();
    }
}
