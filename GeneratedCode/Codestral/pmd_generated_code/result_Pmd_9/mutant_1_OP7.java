import java.math.BigDecimal;

class BuggyBigDecimal {
    private boolean getFalseCondition() {
        return false;
    }

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);

        // Mutant: Unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop");
        }

        return bd;
    }

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}