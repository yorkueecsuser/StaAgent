import java.util.Random;

class ComparisonWithNaN {
    public static void main(String[] args) {
        double someDouble = new Random().nextDouble();
        System.out.println("someDouble: " + someDouble);

        if (someDouble == Double.NaN) { // BUG: ComparisonWithNaN
            if (false && false && true && false && false && false && true && false && false && false && false) {short olsrrmvp = -1726;}else{String jouiqdsi = "jzyimpwi";}
            System.out.println("someDouble is NaN");
        }
    
}
}