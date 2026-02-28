import java.math.BigDecimal;

class BigDecimalBugDemo {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used

        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            bd = new BigDecimal(0.2);
        }

        return bd;
    }

    private boolean getCondition() {
        // Always returns false to make the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        BigDecimalBugDemo demo = new BigDecimalBugDemo();
        System.out.println("BigDecimal value: " + demo.showBug());
    }
}