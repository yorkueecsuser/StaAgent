import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        if (true && true && false && false && false && false && false && true && false && false && false) {boolean rkguzszb = true;}
        BigDecimal bigDecimal = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(bigDecimal);
    
}
}