import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug(double value) {
        BigDecimal bd = new BigDecimal(value); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        
        // Mutation: Unreachable if statement
        boolean isConditionMet = determineCondition();
        if (isConditionMet) {
            // This block is unreachable
            System.out.println("This line will never be executed.");
        }

        return bd;
    }

    private boolean determineCondition() {
        return false; // Always returns false to make the if branch unreachable
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        BigDecimal result = example.showBug(0.1);
        System.out.println("BigDecimal value created from double 0.1: " + result);
    }
}