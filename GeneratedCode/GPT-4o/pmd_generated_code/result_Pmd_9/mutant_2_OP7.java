import java.math.BigDecimal;

class DecimalLiteralBigDecimal {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor

        // Adding an unreachable while loop as per the mutation operator
        boolean conditionWhile = getUnreachableWhileCondition();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This is unreachable code inside while loop.");
        }

        return bd;
    }

    private boolean getUnreachableWhileCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        DecimalLiteralBigDecimal example = new DecimalLiteralBigDecimal();
        BigDecimal result = example.showBug();
        System.out.println("BigDecimal value: " + result);
    }
}