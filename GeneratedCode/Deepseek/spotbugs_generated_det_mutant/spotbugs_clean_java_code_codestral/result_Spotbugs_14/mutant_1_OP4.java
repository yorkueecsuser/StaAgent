import java.math.BigDecimal;

class BigDecimalBug {
    private boolean getFalseCondition() {
        return false;
    }

    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd = new BigDecimal(d); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)

        if (getFalseCondition()) {
            // This block of code is unreachable
            int unreachableCode = 1 / 0;  // This line will cause an exception if the code is ever executed
        } else {
            // This block of code is reachable
            System.out.println("This code is always executed.");
        }

        return bd;
    }
}