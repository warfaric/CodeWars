package ArraysAndStrings;

public class BuildSquare {
    public static void main(String[] args) {
        System.out.print(generateShape(5));
    }
    public static final String generateShape(int n) {
        StringBuilder sb = new StringBuilder();
        String square;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append("+");
            }
            if(i < n-1)
            sb.append("\n");
        }
        square = sb.toString();
        return square;
    }
}
