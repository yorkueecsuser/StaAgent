import java.math.BigDecimal;

class BigDecimalBug {
    public static BigDecimal showBug() {
        if (false && true && true && true && false && false && true && true && false && false && false) {long pqfhokwr = 281988248;}
        BigDecimal buggyBigDecimal = new BigDecimal(0.1);
        System.out.println(buggyBigDecimal);  // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return buggyBigDecimal;
    
}

    public static void main(String[] args) {
        showBug();
    }
}