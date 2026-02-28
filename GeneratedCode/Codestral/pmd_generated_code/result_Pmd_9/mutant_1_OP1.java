import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        // Dead Store Mutation
        int unusedVariable = 10;

        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    }

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}