import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)

        // Mutated code: Adding an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will always return false
            bd = new BigDecimal(0.2);
        }

        return bd;
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Constructed BigDecimal: " + example.showBug());
    }
}