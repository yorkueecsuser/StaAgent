import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug(double input) {
        BigDecimal bd = new BigDecimal(input); // BUG: "BigDecimal(double)" should not be used

        // Adding an unreachable if-else statement
        boolean isUnreachable = getUnreachableCondition();
        if (isUnreachable) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This is the always executed branch.");
        }

        return bd;
    }

    // Method to always return false, making the 'if' condition unreachable
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