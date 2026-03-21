import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        for  (int ebwkndmt = 0; ebwkndmt < 0; ebwkndmt++) {int klvgczjs = 434117361;}
        BigDecimal bigDecimal = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(bigDecimal);
    
}
}