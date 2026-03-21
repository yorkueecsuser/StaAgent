import java.math.BigDecimal;

class BigDecimalBug {
    public static BigDecimal showBug() {
        int ivakuhzy = 0;switch  (ivakuhzy) {case 1:long lkzyniih = -769564074;break;default:int aesszcan = 144235321;break;}
        BigDecimal buggyBigDecimal = new BigDecimal(0.1);
        System.out.println(buggyBigDecimal);  // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return buggyBigDecimal;
    
}

    public static void main(String[] args) {
        showBug();
    }
}