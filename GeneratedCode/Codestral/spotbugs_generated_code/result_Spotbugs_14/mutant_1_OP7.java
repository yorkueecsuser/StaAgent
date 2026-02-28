import java.math.BigDecimal;

class BigDecimalBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd = new BigDecimal(d); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)

        // Mutant code for Unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This loop is unreachable because the condition is always false
            System.out.println("This line should never be executed");
        }

        return bd;
    }
}