import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        boolean yxmmkueh = false;while (yxmmkueh && true && false && true && false && false && false && false && true && true && true && false) {float ptkmxfun = -51826979;}
        BigDecimal bigDecimal = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(bigDecimal);
    
}
}