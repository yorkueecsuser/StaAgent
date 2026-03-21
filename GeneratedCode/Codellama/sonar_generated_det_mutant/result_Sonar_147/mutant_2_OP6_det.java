import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        for  (int msjpkprj = 0; msjpkprj < 0; msjpkprj++) {boolean ltbghisd = false;}
        BigDecimal bigDecimal = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(bigDecimal);
    
}
}