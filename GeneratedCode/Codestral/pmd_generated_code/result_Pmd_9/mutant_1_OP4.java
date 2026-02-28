import java.math.BigDecimal;

class BuggyBigDecimal {
    private boolean getUnreachableCondition() {
        return false;
    }

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);

        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should not execute.");
        } else {
            // Reachable code
            return bd;
        }
    }

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}