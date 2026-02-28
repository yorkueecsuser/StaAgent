import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor

        // Inserting unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // This block will never execute because getCondition() always returns false
            bd = new BigDecimal("0.2");
        } else {
            // This block will always execute
            bd = new BigDecimal("0.3");
        }

        return bd;
    }

    private boolean getCondition() {
        // Always return false to make the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Buggy BigDecimal value: " + example.showBug());
    }
}