import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor

        // Introduced Unreachable For Loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() returns false
            System.out.println("This will never be printed: " + i);
        }

        return bd;
    }

    private boolean getCondition() {
        // Always returns false to ensure the loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Buggy BigDecimal value: " + example.showBug());
    }
}