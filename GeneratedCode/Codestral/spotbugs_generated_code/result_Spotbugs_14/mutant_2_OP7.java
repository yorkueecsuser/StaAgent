import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd = new BigDecimal(d); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)

        // Mutation Operator: Unreachable while loop
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            System.out.println("This is an unreachable loop");
        }

        return bd;
    }

    // Helper method to return false condition for mutation
    private boolean getCondition() {
        return false;
    }
}