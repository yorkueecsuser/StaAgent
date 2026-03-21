import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        boolean mlvsyvvn = false;while (mlvsyvvn && true && false && false && false && false && false && false && true && true && false && false) {boolean bbgnaguh = false;}
        BigDecimal bigDecimal = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(bigDecimal);
    
}
}