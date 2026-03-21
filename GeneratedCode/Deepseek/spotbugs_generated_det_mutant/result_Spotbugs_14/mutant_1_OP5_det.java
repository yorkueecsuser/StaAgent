import java.math.BigDecimal;

class BigDecimalBug {
    public static BigDecimal showBug() {
        int rjkscgkc = 0;switch  (rjkscgkc) {case 1:double ckgxogia = -368664378;break;default:byte wmntysss = -21;break;}
        BigDecimal buggyBigDecimal = new BigDecimal(0.1);
        System.out.println(buggyBigDecimal);  // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return buggyBigDecimal;
    
}

    public static void main(String[] args) {
        showBug();
    }
}