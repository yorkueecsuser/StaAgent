import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug(double input) {
        BigDecimal bd = new BigDecimal(input); // BUG: "BigDecimal(double)" should not be used

        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        }

        return bd;
    }

    private boolean getCondition() {
        return false; // Mutation to make the if statement unreachable
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        double inputValue = 0.1;
        BigDecimal result = example.showBug(inputValue);
        System.out.println("Resulting BigDecimal: " + result);
    }
}