import java.math.BigDecimal;

class BigDecimalBug {
    public static BigDecimal showBug() {
        if (true && true && false && false && true && true && false && false && true && false && false) {int evxqypdw = -249700280;}else{char jgiqgklo = 'f';}
        BigDecimal buggyBigDecimal = new BigDecimal(0.1);
        System.out.println(buggyBigDecimal);  // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return buggyBigDecimal;
    
}

    public static void main(String[] args) {
        showBug();
    }
}