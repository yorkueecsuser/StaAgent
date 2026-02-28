import java.math.BigDecimal;

class DecimalLiteralBigDecimal {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        
        // Introducing unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block will never be executed.");
        } else {
            System.out.println("This block is always executed.");
        }

        return bd;
    }

    // Helper method to provide a condition, always returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DecimalLiteralBigDecimal example = new DecimalLiteralBigDecimal();
        BigDecimal result = example.showBug();
        System.out.println("BigDecimal value: " + result);
    }
}