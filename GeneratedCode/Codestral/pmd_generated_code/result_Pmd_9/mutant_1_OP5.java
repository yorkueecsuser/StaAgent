import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);

        // Mutation: Unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value = getValue();
            switch (value) {
                case 1:
                    // Unreachable code
                    System.out.println("This code should never be reached");
                    break;
            }
        }

        return bd;
    }

    private boolean getCondition() {
        return false; // Always returns false to make the if condition unreachable
    }

    private int getValue() {
        return 0; // Always returns 0 which is not case 1, making the switch statement unreachable
    }

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}