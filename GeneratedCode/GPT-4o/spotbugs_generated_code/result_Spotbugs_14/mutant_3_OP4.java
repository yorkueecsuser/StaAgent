import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug(double value) {
        BigDecimal bd = new BigDecimal(value); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)

        // Introduce unreachable if-else statement
        boolean condition = getCondition(); // Method to get condition
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch is also unreachable.");
        }

        return bd;
    }

    // Method to simulate a runtime condition check for the unreachable if-else
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        BigDecimal result = example.showBug(0.1);
        System.out.println("BigDecimal value created from double 0.1: " + result);
    }
}