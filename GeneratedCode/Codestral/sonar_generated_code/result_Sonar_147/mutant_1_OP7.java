import java.math.BigDecimal;

class BigDecimalBug {
    private boolean getFalseCondition() {
        return false; // Method returning a false condition
    }

    public BigDecimal showBug() {
        BigDecimal buggyDecimal = new BigDecimal(0.1);

        // Added unreachable while loop as per mutation operator
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This block will never be executed
            System.out.println("Unreachable code");
        }

        return buggyDecimal;
    }

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        BigDecimal buggyDecimal = bug.showBug();
        System.out.println("Buggy Decimal: " + buggyDecimal);
    }
}