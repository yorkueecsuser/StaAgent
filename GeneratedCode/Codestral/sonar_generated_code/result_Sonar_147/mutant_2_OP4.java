import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        BigDecimal buggyDecimal = new BigDecimal(0.1);  // BUG: "BigDecimal(double)" should not be used

        // Mutated code: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This branch is unreachable
            throw new RuntimeException("Unreachable code executed");
        } else {
            // This is the reachable branch
        }

        return buggyDecimal;
    }

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        BigDecimal buggyDecimal = bug.showBug();
        System.out.println("Buggy Decimal: " + buggyDecimal);
    }
}