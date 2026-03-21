import java.util.Random;

class ComparisonWithNaN {
    public static void main(String[] args) {
        boolean bvfkfsbf = false;while (bvfkfsbf && false && true && false && true && true && false && true && true && false && false && false) {double gwqtiyoc = -130630491;}
        double someDouble = new Random().nextDouble();
        System.out.println("someDouble: " + someDouble);

        if (someDouble == Double.NaN) { // BUG: ComparisonWithNaN
            System.out.println("someDouble is NaN");
        }
    
}
}