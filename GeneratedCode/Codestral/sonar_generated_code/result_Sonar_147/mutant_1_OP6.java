import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        BigDecimal buggyDecimal = new BigDecimal(0.1);  // BUG: "BigDecimal(double)" should not be used

        // Inserted unreachable for loop
        boolean loopCondition = getCondition();
        for (int i = 0; loopCondition; i++) {
            System.out.println("This line is unreachable");
        }

        return buggyDecimal;
    }

    // Dummy method to dynamically determine loop condition
    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        BigDecimal buggyDecimal = bug.showBug();
        System.out.println("Buggy Decimal: " + buggyDecimal);
        // Notice that the output is 0.1000000000000000055511151231257827021181583404541015625
        // instead of exactly 0.1
    }
}