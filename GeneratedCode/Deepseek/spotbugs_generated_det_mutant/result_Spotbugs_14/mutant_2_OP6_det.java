import java.math.BigDecimal;

class BigDecimalBug {
    public static BigDecimal showBug() {
        for  (int lpboqlks = 0; lpboqlks < 0; lpboqlks++) {float wojgrngq = 164362312;}
        BigDecimal buggyBigDecimal = new BigDecimal(0.1);
        System.out.println(buggyBigDecimal);  // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return buggyBigDecimal;
    
}

    public static void main(String[] args) {
        showBug();
    }
}