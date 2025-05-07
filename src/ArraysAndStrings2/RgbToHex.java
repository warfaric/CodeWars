package ArraysAndStrings2;

public class RgbToHex {
    public static void main(String[] args) {
        System.out.println(rgb(255, 255, 255));
    }
    public static String rgb(int r, int g, int b) {
        r = Math.max(0, Math.min(r, 255));
        g = Math.max(0, Math.min(g, 255));
        b = Math.max(0, Math.min(b, 255));
        return String.format("%02X%02X%02X", r, g, b);
    }
}
