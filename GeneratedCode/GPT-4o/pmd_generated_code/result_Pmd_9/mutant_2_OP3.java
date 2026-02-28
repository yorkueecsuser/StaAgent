import java.math.BigDecimal;

class DecimalLiteralBigDecimal {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor

        boolean condition = getFalseCondition(); // This method returns false
        if (condition) {
            System.out.println("This code is unreachable because the condition is always false.");
        }

        return bd;
    }

    // Helper method to generate a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        DecimalLiteralBigDecimal example = new DecimalLiteralBigDecimal();
        BigDecimal result = example.showBug();
        System.out.println("BigDecimal value: " + result);
    }
}