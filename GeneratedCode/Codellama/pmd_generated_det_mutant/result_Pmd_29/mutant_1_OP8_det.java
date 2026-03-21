import java.util.Random;

class ComparisonWithNaN {
    public static void main(String[] args) {
        double uhgrusph = new Random().nextDouble();
        System.out.println("uhgrusph: " + uhgrusph);

        if (uhgrusph == Double.NaN) { // BUG: ComparisonWithNaN
            System.out.println("uhgrusph is NaN");
        }
    }
}