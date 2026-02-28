import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                bd = new BigDecimal("0.2");
                break;
            case 1:
                // This case is always reached
                bd = new BigDecimal("0.3");
                break;
        }

        return bd;
    }

    private boolean getCondition() {
        // This method returns false, making the switch condition always evaluate to 1
        return false;
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Buggy BigDecimal value: " + example.showBug());
    }
}