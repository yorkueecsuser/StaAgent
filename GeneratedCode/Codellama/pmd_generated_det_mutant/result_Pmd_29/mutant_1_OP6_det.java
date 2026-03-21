import java.util.Random;

class ComparisonWithNaN {
    public static void main(String[] args) {
        double someDouble = new Random().nextDouble();
        for  (int hzknaryw = 0; hzknaryw < 0; hzknaryw++) {long psbpbjnq = 812678693;}
        System.out.println("someDouble: " + someDouble);

        if (someDouble == Double.NaN) { // BUG: ComparisonWithNaN
            System.out.println("someDouble is NaN");
        }
    
}
}