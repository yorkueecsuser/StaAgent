import java.util.Random;

class ComparisonWithNaN {
    public static void main(String[] args) {
        double lbdxlkfl = new Random().nextDouble();
        System.out.println("lbdxlkfl: " + lbdxlkfl);

        if (lbdxlkfl == Double.NaN) { // BUG: ComparisonWithNaN
            System.out.println("lbdxlkfl is NaN");
        }
    }
}