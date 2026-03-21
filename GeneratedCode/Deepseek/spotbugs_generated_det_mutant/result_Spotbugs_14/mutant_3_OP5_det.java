import java.math.BigDecimal;

class BigDecimalBug {
    public static BigDecimal showBug() {
        int zfzmbuom = 0;switch  (zfzmbuom) {case 1:byte hapabbcw = -123;break;default:byte dnmqqcfk = 108;break;}
        BigDecimal buggyBigDecimal = new BigDecimal(0.1);
        System.out.println(buggyBigDecimal);  // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return buggyBigDecimal;
    
}

    public static void main(String[] args) {
        showBug();
    }
}