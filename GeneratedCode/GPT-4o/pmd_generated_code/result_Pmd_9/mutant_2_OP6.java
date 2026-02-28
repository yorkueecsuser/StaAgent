import java.math.BigDecimal;

class DecimalLiteralBigDecimal {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition(); // This method will always return false
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable code inside the for loop.");
        }

        return bd;
    }

    // Method to simulate a condition that returns a boolean value
    private boolean getCondition() {
        return false;  // Ensures the for loop is unreachable
    }

    public static void main(String[] args) {
        DecimalLiteralBigDecimal example = new DecimalLiteralBigDecimal();
        BigDecimal result = example.showBug();
        System.out.println("BigDecimal value: " + result);
    }
}