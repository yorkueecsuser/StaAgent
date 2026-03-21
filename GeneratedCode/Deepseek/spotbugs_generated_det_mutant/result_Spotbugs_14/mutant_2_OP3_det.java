import java.math.BigDecimal;

class BigDecimalBug {
    public static BigDecimal showBug() {
        if (false && true && false && true && true && false && true && true && false && true && false) {float gqggbxhw = -988204381;}
        BigDecimal buggyBigDecimal = new BigDecimal(0.1);
        System.out.println(buggyBigDecimal);  // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return buggyBigDecimal;
    
}

    public static void main(String[] args) {
        showBug();
    }
}