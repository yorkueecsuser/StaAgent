import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        BigDecimal buggyDecimal = new BigDecimal(0.1);  // BUG: "BigDecimal(double)" should not be used

        // Mutated Code: Unreachable if statement
        boolean unreachableCondition = falseCondition();
        if (unreachableCondition) {
            System.out.println("This is an unreachable block of code");
        }

        return buggyDecimal;
    }

    private boolean falseCondition() {
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