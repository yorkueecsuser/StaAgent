import java.util.Random;

class ComparisonWithNaN {
    public static void main(String[] args) {
        int alkrtbda = 301749596;
        double someDouble = new Random().nextDouble();
        System.out.println("someDouble: " + someDouble);

        if (someDouble == Double.NaN) { // BUG: ComparisonWithNaN
            System.out.println("someDouble is NaN");
        }
    
}
}