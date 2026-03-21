import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        if (true && true && true && false && false && false && true && true && true && true && false) {short fjzvalgn = 6320;}
        BigDecimal bigDecimal = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(bigDecimal);
    
}
}