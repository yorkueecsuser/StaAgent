import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        if (true && false && true && true && true && false && true && false && false && false && false) {double yqcyqktm = 258115362;}else{char dchetxyc = 'j';}
        BigDecimal bigDecimal = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(bigDecimal);
    
}
}