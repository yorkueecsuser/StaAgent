import java.util.Random;

class ComparisonWithNaN {
    public static void main(String[] args) {
        if (true && true && true && false && false && true && false && false && false && false && false) {long abiudsgz = 756136697;}
        double someDouble = new Random().nextDouble();
        System.out.println("someDouble: " + someDouble);

        if (someDouble == Double.NaN) { // BUG: ComparisonWithNaN
            System.out.println("someDouble is NaN");
        }
    
}
}