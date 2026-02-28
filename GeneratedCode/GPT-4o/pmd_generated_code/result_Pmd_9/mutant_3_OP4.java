import java.math.BigDecimal;

class DecimalLiteralBigDecimal {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        
        // A dynamically determined condition to create an unreachable if-else branch
        boolean condition = computeCondition();
        if (condition) {
            System.out.println("This will never print.");
        } else {
            System.out.println("This will always print.");
        }

        return bd;
    }

    private boolean computeCondition() {
        // This method returns false, but it's not a compile-time constant,
        // thus avoiding unreachable statement error.
        return false;
    }

    public static void main(String[] args) {
        DecimalLiteralBigDecimal example = new DecimalLiteralBigDecimal();
        BigDecimal result = example.showBug();
        System.out.println("BigDecimal value: " + result);
    }
}