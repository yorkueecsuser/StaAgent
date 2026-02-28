import java.math.BigDecimal;

class DecimalLiteralBigDecimal {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        // Adding unreachable switch statement mutation
        int unreachableSwitchValue = getUnreachableValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This will never execute.");
                break;
            default:
                // Default case does nothing, making switch unreachable
                break;
        }
        return bd;
    }

    private int getUnreachableValue() {
        // This method will always return a value that makes the switch statement unreachable
        return 0; // Ensures the switch statement doesn't execute any case
    }

    public static void main(String[] args) {
        DecimalLiteralBigDecimal example = new DecimalLiteralBigDecimal();
        BigDecimal result = example.showBug();
        System.out.println("BigDecimal value: " + result);
    }
}