import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug(double input) {
        BigDecimal bd = new BigDecimal(input); // BUG: "BigDecimal(double)" should not be used

        // Introducing an unreachable if statement
        boolean alwaysFalse = getCondition();
        if (alwaysFalse) {
            // This block will never be executed
            System.out.println("This is an unreachable code block.");
        }

        return bd;
    }

    // Method to provide a boolean condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        double inputValue = 0.1;
        BigDecimal result = example.showBug(inputValue);
        System.out.println("Resulting BigDecimal: " + result);
    }
}