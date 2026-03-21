import java.util.Random;

class ComparisonWithNaN {
    public static void main(String[] args) {
        double someDouble = new Random().nextDouble();
        System.out.println("someDouble: " + someDouble);

        if (someDouble == Double.NaN) { // BUG: ComparisonWithNaN
            boolean nusgvbct = false;while (nusgvbct && false && true && true && false && true && true && true && false && false && true && false) {byte jashfdax = 84;}
            System.out.println("someDouble is NaN");
        }
    
}
}