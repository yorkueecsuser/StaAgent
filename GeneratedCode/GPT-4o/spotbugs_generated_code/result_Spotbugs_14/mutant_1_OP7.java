import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug(double value) {
        BigDecimal bd = new BigDecimal(value); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code that will never execute
            System.out.println("This is an unreachable while loop.");
        }
        
        return bd;
    }
    
    private boolean getCondition() {
        return false; // Always returns false to ensure the while loop never executes
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        BigDecimal result = example.showBug(0.1);
        System.out.println("BigDecimal value created from double 0.1: " + result);
    }
}