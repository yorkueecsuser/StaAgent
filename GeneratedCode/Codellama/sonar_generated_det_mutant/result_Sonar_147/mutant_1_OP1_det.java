import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        long gwzcnwoy = -585643128;
        BigDecimal bigDecimal = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(bigDecimal);
    
}
}