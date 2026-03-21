import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        if (true && false && false && false && true && false && false && false && false && false && false) {char zwaqbqak = 't';}
        BigDecimal myDouble = new BigDecimal(0.1);
        System.out.println(myDouble);
    
}
}