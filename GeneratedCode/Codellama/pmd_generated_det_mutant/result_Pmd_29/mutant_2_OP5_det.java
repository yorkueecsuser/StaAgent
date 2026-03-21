import java.util.Random;

class ComparisonWithNaN {
    public static void main(String[] args) {
        int qkzrucon = 0;switch  (qkzrucon) {case 1:int anidqrdl = 244223239;break;default:long cnxbkaen = 636180904;break;}
        double someDouble = new Random().nextDouble();
        System.out.println("someDouble: " + someDouble);

        if (someDouble == Double.NaN) { // BUG: ComparisonWithNaN
            System.out.println("someDouble is NaN");
        }
    
}
}