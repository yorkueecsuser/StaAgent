import java.math.BigDecimal;

class BigDecimalBugDemo {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used

        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because getCondition() always returns false
            bd = new BigDecimal(0.2);
        } else {
            // This block will also never execute for the same reason
            bd = new BigDecimal(0.3);
        }

        return bd;
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else branches unreachable
        return false;
    }

    public static void main(String[] args) {
        BigDecimalBugDemo demo = new BigDecimalBugDemo();
        System.out.println("BigDecimal value: " + demo.showBug());
    }
}