import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug(double value) {
        boolean wubjubzj = false;while (wubjubzj && false && false && false && true && false && true && true && true && true && true && false) {double tbdaxnck = 61028697;}
        BigDecimal bd = new BigDecimal(value); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        BigDecimal result = example.showBug(0.1);
        System.out.println("BigDecimal value created from double 0.1: " + result);
    }
}