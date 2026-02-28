import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        // Original code
        BigDecimal bd = new BigDecimal(0.1);

        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code will never be executed
        }

        return bd;
    }

    private boolean getCondition() {
        // This method will always return false, making the loop unreachable
        return false;
    }

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}