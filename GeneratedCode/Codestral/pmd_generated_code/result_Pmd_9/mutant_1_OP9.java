import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        // Mutation: Using the double literal 0.1 in the BigDecimal constructor
        BigDecimal bd = new BigDecimal(0.1 + 0.0);  // Mutated to introduce the original bug
        return bd;
    }

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}