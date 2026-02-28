import java.math.BigDecimal;

class DecimalLiteralBigDecimal {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        
        // Inserting an unreachable if branch
        boolean condition = getUnreachableCondition(); // This condition is always false

        if (condition) {
            System.out.println("This branch is unreachable.");
        }

        return bd;
    }

    // The method that returns false to simulate an unreachable if statement
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        DecimalLiteralBigDecimal example = new DecimalLiteralBigDecimal();
        BigDecimal result = example.showBug();
        System.out.println("BigDecimal value: " + result);
    }
}