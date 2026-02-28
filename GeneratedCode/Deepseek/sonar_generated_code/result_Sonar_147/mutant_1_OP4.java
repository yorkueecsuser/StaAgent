import java.math.BigDecimal;

class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimalTest test = new BigDecimalTest();
        test.showBug();
    }

    public void showBug() {
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(value);

        // Added mutant
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This code will never be executed!");
        } else {
            // Do nothing
        }
    }

    // Helper method to ensure the condition of the if-else statement is dynamically determined at runtime
    private boolean getCondition() {
        return false;
    }
}