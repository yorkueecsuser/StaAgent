import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        BigDecimal buggyDecimal = new BigDecimal(0.1);  // BUG: "BigDecimal(double)" should not be used

        // Mutant: Unreachable if statement
        boolean condition = isUnreachableCondition();
        if (condition) {
            System.out.println("This will never be printed");
        }

        return buggyDecimal;
    }

    // Method to dynamically determine the condition
    private boolean isUnreachableCondition() {
        // This could be any complex logic that returns false at runtime
        return false;
    }

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        BigDecimal buggyDecimal = bug.showBug();
        System.out.println("Buggy Decimal: " + buggyDecimal);
        // Notice that the output is 0.1000000000000000055511151231257827021181583404541015625
        // instead of exactly 0.1
    }
}