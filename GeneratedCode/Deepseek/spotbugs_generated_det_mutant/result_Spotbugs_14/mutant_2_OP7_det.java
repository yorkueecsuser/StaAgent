import java.math.BigDecimal;

class BigDecimalBug {
    public static BigDecimal showBug() {
        boolean resgblhx = false;while (resgblhx && true && false && true && false && true && true && false && false && true && false && false) {float wigufard = -797218221;}
        BigDecimal buggyBigDecimal = new BigDecimal(0.1);
        System.out.println(buggyBigDecimal);  // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return buggyBigDecimal;
    
}

    public static void main(String[] args) {
        showBug();
    }
}