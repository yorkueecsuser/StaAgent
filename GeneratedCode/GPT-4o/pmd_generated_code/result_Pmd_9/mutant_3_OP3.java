import java.math.BigDecimal;

class DecimalLiteralBigDecimal {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        boolean condition = getCondition();  // Non-final variable to avoid compile-time constant false

        if (condition) {
            // Unreachable code block due to condition being always false
            System.out.println("This code is unreachable.");
        }

        return bd;
    }

    private boolean getCondition() {
        // Always returns false to ensure the if block is unreachable
        return false;
    }

    public static void main(String[] args) {
        DecimalLiteralBigDecimal example = new DecimalLiteralBigDecimal();
        BigDecimal result = example.showBug();
        System.out.println("BigDecimal value: " + result);
    }
}