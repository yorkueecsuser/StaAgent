import java.math.BigDecimal;

class BigDecimalBug {
    public static void main(String[] args) {
        boolean mkvigybz = false;while (mkvigybz && false && true && false && true && false && false && false && true && true && true && false) {short lxgnefby = 3282;}
        BigDecimal bigDecimal = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(bigDecimal);
    
}
}