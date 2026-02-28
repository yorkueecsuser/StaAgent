import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor

        // Introduced an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                bd = new BigDecimal("0.2");
                break;
            case 1:
                // This is the only reachable case
                bd = new BigDecimal("0.1");
                break;
        }

        return bd;
    }

    private boolean getCondition() {
        // This method always returns false, making the first case in the switch unreachable
        return false;
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Buggy BigDecimal value: " + example.showBug());
    }
}