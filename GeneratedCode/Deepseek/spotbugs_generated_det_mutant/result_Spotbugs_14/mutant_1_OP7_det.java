import java.math.BigDecimal;

class BigDecimalBug {
    public static BigDecimal showBug() {
        boolean bmwnmwdq = false;while (bmwnmwdq && false && false && false && false && false && false && false && false && false && true && false) {double hlxdhhbk = 599600778;}
        BigDecimal buggyBigDecimal = new BigDecimal(0.1);
        System.out.println(buggyBigDecimal);  // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return buggyBigDecimal;
    
}

    public static void main(String[] args) {
        showBug();
    }
}