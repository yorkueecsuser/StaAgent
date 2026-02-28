import java.math.BigDecimal;

class BuggyBigDecimal {
    public boolean getCondition() {
        return false;
    }

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor

        // Mutant code: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never be executed
            System.out.println("Unreachable code");
        }

        return bd;
    }

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}