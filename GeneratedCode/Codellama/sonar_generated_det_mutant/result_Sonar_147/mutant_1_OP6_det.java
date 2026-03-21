import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        for  (int cnszadak = 0; cnszadak < 0; cnszadak++) {short sgnsqpfq = -9636;}
        BigDecimal bigDecimal = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(bigDecimal);
    
}
}