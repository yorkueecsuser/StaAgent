import java.math.BigDecimal;

class BigDecimalBugExample {

    // Method to simulate an unreachable condition
    private boolean getUnreachableCondition() {
        return false; // This condition is always false
    }

    public BigDecimal showBug(double input) {
        BigDecimal bd = new BigDecimal(input); // BUG: "BigDecimal(double)" should not be used
        // Adding unreachable if branch
        boolean unreachable = getUnreachableCondition();
        if (unreachable) {
            System.out.println("This code is unreachable.");
        }
        return bd;
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        double inputValue = 0.1;
        BigDecimal result = example.showBug(inputValue);
        System.out.println("Resulting BigDecimal: " + result);
    }
}