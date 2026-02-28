import java.math.BigDecimal;

class BigDecimalBugDemo {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor will always be false
            System.out.println("This loop should never execute.");
        }

        return bd;
    }

    private boolean getCondition() {
        // This method returns false, making the loop condition always false
        return false;
    }

    public static void main(String[] args) {
        BigDecimalBugDemo demo = new BigDecimalBugDemo();
        System.out.println("BigDecimal value: " + demo.showBug());
    }
}