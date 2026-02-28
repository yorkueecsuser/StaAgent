import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug(double input) {
        BigDecimal bd = new BigDecimal(input); // BUG: "BigDecimal(double)" should not be used

        // Unreachable while loop mutant insertion
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            System.out.println("This code is unreachable.");
        }

        return bd;
    }

    // Method to provide a dynamic condition for the unreachable while loop
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        double inputValue = 0.1;
        BigDecimal result = example.showBug(inputValue);
        System.out.println("Resulting BigDecimal: " + result);
    }
}