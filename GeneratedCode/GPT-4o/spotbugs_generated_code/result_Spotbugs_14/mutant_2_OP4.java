import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug(double value) {
        BigDecimal bd = new BigDecimal(value); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        
        // Mutation: Unreachable if-else statement
        boolean condition = getFalseCondition(); // Dynamically determined at runtime
        if (condition) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This is the else part of the unreachable if-else statement");
        }
        
        return bd;
    }

    private boolean getFalseCondition() {
        return false; // This method always returns false, making the if-block unreachable
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        BigDecimal result = example.showBug(0.1);
        System.out.println("BigDecimal value created from double 0.1: " + result);
    }
}