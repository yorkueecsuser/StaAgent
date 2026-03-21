import java.util.Random;

class ComparisonWithNaN {
    public static void main(String[] args) {
        double azzypbcp = new Random().nextDouble();
        System.out.println("azzypbcp: " + azzypbcp);

        if (azzypbcp == Double.NaN) { // BUG: ComparisonWithNaN
            System.out.println("azzypbcp is NaN");
        }
    }
}