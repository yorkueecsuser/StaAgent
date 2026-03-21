import java.math.BigDecimal;

class BigDecimalBug {
public static void main(String [] args){
    BigDecimal bigDecimal = new BigDecimal(0.1);
    bigDecimal = new BigDecimal(0.1);
    System.out.println(bigDecimal);
}
}