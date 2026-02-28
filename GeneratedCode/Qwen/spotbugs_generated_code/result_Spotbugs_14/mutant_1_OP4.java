import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        
        // Mutated code: Adding an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is reachable code.");
        } else {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is unreachable code.");
        }
        
        return bd;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the else block unreachable
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Constructed BigDecimal: " + example.showBug());
    }
}