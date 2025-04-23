package CyclesAndPrimitives;


public class GrowthOfPopulation {
    public static void main(String[] args) {
        System.out.println(nbYear(150, 100, 0, 600));
    }
    public static int nbYear(int p0, double percent, int aug, int p) {
        int cycles = 0;
        double doubleP0 = p0;
        while(doubleP0 < p){
            doubleP0 = doubleP0 + (doubleP0 * (percent / 100)) + aug;
            cycles++;
            doubleP0 = Math.floor(doubleP0);
        }
        return cycles;
    }
}
