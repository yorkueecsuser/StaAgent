import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        BigDecimal myDouble = new BigDecimal(0.1);
        System.out.println(myDouble);
    }
}