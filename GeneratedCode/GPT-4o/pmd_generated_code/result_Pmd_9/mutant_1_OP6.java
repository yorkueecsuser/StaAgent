import java.math.BigDecimal;

class DecimalLiteralBigDecimal {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor

        boolean conditionFor = getCondition(); // Ensures the loop is unreachable but doesn't cause a compile-time error
        for (int i = 0; conditionFor; i++) {
            // This block of code is unreachable
            System.out.println("This for loop is unreachable.");
        }

        return bd;
    }

    private boolean getCondition() {
        return false; // Method to ensure the condition is not a compile-time constant
    }

    public static void main(String[] args) {
        DecimalLiteralBigDecimal example = new DecimalLiteralBigDecimal();
        BigDecimal result = example.showBug();
        System.out.println("BigDecimal value: " + result);
    }
}