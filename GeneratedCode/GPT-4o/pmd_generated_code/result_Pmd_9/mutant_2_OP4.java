import java.math.BigDecimal;

class DecimalLiteralBigDecimal {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor

        // Introduce an unreachable if-else branch
        boolean condition = getCondition(); // dynamically determined at runtime
        if (condition) {
            // This block is logically unreachable because condition will always be false
            System.out.println("This will never print.");
        } else {
            // This branch is always executed
            System.out.println("Executing the else branch.");
        }

        return bd;
    }

    // Method to dynamically determine the condition
    private boolean getCondition() {
        return false; // Ensures the if condition is never true
    }

    public static void main(String[] args) {
        DecimalLiteralBigDecimal example = new DecimalLiteralBigDecimal();
        BigDecimal result = example.showBug();
        System.out.println("BigDecimal value: " + result);
    }
}