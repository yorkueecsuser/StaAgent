import java.math.BigDecimal;

class BigDecimalBugDemo {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will always return false
            System.out.println("This is an unreachable loop");
        }

        return bd;
    }

    private boolean getCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        BigDecimalBugDemo demo = new BigDecimalBugDemo();
        System.out.println("BigDecimal value: " + demo.showBug());
    }
}