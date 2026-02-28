import java.math.BigDecimal;

class DecimalLiteralBigDecimal {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor

        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue(); // dynamically determined at runtime
        switch (unreachableValue) {
            case 1:
                System.out.println("Unreachable case 1");
                break;
            case 2:
                System.out.println("Unreachable case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }

        return bd;
    }

    // Method to simulate a condition that ensures the switch statement is unreachable.
    // It should always return a value not covered by the cases.
    private int getUnreachableValue() {
        return 3; // This value does not match any case, leaving only the default path reachable.
    }

    public static void main(String[] args) {
        DecimalLiteralBigDecimal example = new DecimalLiteralBigDecimal();
        BigDecimal result = example.showBug();
        System.out.println("BigDecimal value: " + result);
    }
}