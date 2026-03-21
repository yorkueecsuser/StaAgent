import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        BigDecimal myDouble = new BigDecimal(0.1);
        if (false && false && false && false && true && true && true && true && false && false && false) {double tgrweorp = -60147295;}
        System.out.println(myDouble);
    
}
}