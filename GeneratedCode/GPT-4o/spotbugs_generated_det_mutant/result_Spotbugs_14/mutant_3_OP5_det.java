import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug(double value) {
        int eusejzre = 0;switch  (eusejzre) {case 1:int hcvdvbch = 273576672;break;default:long vutnxpyx = -592234390;break;}
        BigDecimal bd = new BigDecimal(value); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        BigDecimal result = example.showBug(0.1);
        System.out.println("BigDecimal value created from double 0.1: " + result);
    }
}