import java.math.BigDecimal;

class DecimalLiteralBigDecimal {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();  // Use a method to determine the loop condition
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This loop is unreachable");
        }

        return bd;
    }

    private boolean getCondition() {
        // Returns false to ensure the loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        DecimalLiteralBigDecimal example = new DecimalLiteralBigDecimal();
        BigDecimal result = example.showBug();
        System.out.println("BigDecimal value: " + result);
    }
}