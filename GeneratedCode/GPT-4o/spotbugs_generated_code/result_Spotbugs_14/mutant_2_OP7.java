import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug(double value) {
        BigDecimal bd = new BigDecimal(value); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        
        // Unreachable while loop mutation
        boolean conditionWhile = getFalseCondition(); // Dynamically determined at runtime
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }

        return bd;
    }
    
    // Helper method to ensure the loop is unreachable
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        BigDecimal result = example.showBug(0.1);
        System.out.println("BigDecimal value created from double 0.1: " + result);
    }
}