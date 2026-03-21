import java.util.Random;

class ComparisonWithNaN {
    public static void main(String[] args) {
        double someDouble = new Random().nextDouble();
        System.out.println("someDouble: " + someDouble);

        if (someDouble == Double.NaN) { // BUG: ComparisonWithNaN
            boolean uvpfddmx = false;while (uvpfddmx && false && false && true && true && true && false && true && false && true && true && false) {char plsqfrmu = 'r';}
            System.out.println("someDouble is NaN");
        }
    
}
}