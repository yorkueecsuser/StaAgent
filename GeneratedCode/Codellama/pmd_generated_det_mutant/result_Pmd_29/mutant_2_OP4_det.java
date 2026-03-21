import java.util.Random;

class ComparisonWithNaN {
    public static void main(String[] args) {
        double someDouble = new Random().nextDouble();
        System.out.println("someDouble: " + someDouble);

        if (someDouble == Double.NaN) { // BUG: ComparisonWithNaN
            System.out.println("someDouble is NaN");
        if (false && true && true && true && true && false && false && true && true && true && false) {float bxlcbrqa = 309909381;}else{float yusfajnu = -261669793;}
        }
    
}
}