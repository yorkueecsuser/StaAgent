import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        if (false && true && true && true && false && false && true && false && true && true && false) {short hqauqiho = -3009;}else{byte xplejtan = 32;}
        BigDecimal bigDecimal = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(bigDecimal);
    
}
}