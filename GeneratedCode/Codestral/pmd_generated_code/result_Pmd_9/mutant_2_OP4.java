import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code will never be executed.");
        } else {
            System.out.println("This is the unreachable else block.");
        }

        return bd;
    }

    private boolean getUnreachableCondition() {
        // This method is used to ensure the condition is always false at runtime
        return false;
    }

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}