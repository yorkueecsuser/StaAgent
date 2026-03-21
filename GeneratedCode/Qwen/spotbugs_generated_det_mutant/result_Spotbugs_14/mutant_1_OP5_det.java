import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        int kpmuahmq = 0;switch  (kpmuahmq) {case 1:int romjxmqj = -390840360;break;default:double czlhjcox = -456306405;break;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Constructed BigDecimal: " + example.showBug());
    }
}