import java.math.BigDecimal;

class DecimalLiteralBigDecimal {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor

        // Inserting an unreachable switch statement
        int unreachableCondition = getUnreachableCondition(); // Using a method for condition
        switch (unreachableCondition) {
            case 999: // This case will never be reached given the condition
                System.out.println("This is unreachable code.");
                break;
        }

        return bd;
    }

    // Method that provides the condition for the switch statement
    private int getUnreachableCondition() {
        return 0; // Always returns 0, thus the switch case 999 is never reached
    }

    public static void main(String[] args) {
        DecimalLiteralBigDecimal example = new DecimalLiteralBigDecimal();
        BigDecimal result = example.showBug();
        System.out.println("BigDecimal value: " + result);
    }
}