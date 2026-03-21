import java.math.BigDecimal;

class BigDecimalBug {
    public static BigDecimal showBug() {
        boolean rhorhxzf = false;while (rhorhxzf && true && true && true && true && true && true && true && false && false && false && false) {float rgjfnuru = -3421732;}
        BigDecimal buggyBigDecimal = new BigDecimal(0.1);
        System.out.println(buggyBigDecimal);  // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return buggyBigDecimal;
    
}

    public static void main(String[] args) {
        showBug();
    }
}