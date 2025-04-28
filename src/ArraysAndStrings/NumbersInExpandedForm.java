package ArraysAndStrings;

public class NumbersInExpandedForm {
    public static void main(String[] args) {
        System.out.println(expandedForm(2234));
        System.out.println(expandedForm(90000));
        System.out.println(expandedForm(1875611094));
        System.out.println(expandedForm(791394920));
    }
    public static String expandedForm(int num) {
        StringBuilder sb = new StringBuilder();
        int divider = (int)Math.pow(10, Integer.toString(num).length() - 1);
        if(!(num % divider == 0))
            while (divider > 0) {
                if(!(num / divider == 0)) {
                    sb.append(num / divider * divider);
                    if (divider >= 10 && num % divider != 0)
                        sb.append(" + ");
                }
                num %= divider;
                divider /= 10;
            }
        else
            sb.append(num);

        return sb.toString();
    }
}


//<1000000000 + 800000000 + 70000000 + 5000000 + 600000 + 10000 + 1000 + 90 + 4>1875611094
//<1000000000 + 800000000 + 70000000 + 5000000 + 600000 + 10000 + 1000 + 0 + 90 + 4>
//<700000000 + 90000000 + 1000000 + 300000 + 90000 + 4000 + 900 + 20>791394920
//<700000000 + 90000000 + 1000000 + 300000 + 90000 + 4000 + 900 + 20 + >