import java.math.BigDecimal;

class BigDecimalBugExample {
    
    public BigDecimal showBug(double input) {
        BigDecimal bd = new BigDecimal(input); // BUG: "BigDecimal(double)" should not be used
        
        // Inserting an unreachable while loop with a dynamic runtime condition
        boolean conditionWhile = getFalseCondition(); // This method always returns false
        while (conditionWhile) {
            System.out.println("This code is unreachable");
        }
        
        return bd;
    }

    private boolean getFalseCondition() {
        return false; // The condition for the while loop, ensuring it's unreachable
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        double inputValue = 0.1;
        BigDecimal result = example.showBug(inputValue);
        System.out.println("Resulting BigDecimal: " + result);
    }
}