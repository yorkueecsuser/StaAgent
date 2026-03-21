import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        if (true && false && true && false && true && false && true && false && false && false && false) {int atesceym = -521928880;}
        BigDecimal bigDecimal = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(bigDecimal);
    
}
}