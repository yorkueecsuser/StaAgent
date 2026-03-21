import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        if (true && true && false && true && true && true && true && false && true && true && false) {long wnvutnks = -653848095;}
        BigDecimal myDouble = new BigDecimal(0.1);
        System.out.println(myDouble);
    
}
}