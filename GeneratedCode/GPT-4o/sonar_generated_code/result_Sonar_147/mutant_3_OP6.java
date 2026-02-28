import java.math.BigDecimal;

class BigDecimalBugExample {
    
    public BigDecimal showBug(double input) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable
            System.out.println("This for loop is unreachable.");
        }
        
        BigDecimal bd = new BigDecimal(input); // BUG: "BigDecimal(double)" should not be used
        return bd;
    }

    private boolean getCondition() {
        return false; // Ensures the condition is determined at runtime
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        double inputValue = 0.1;
        BigDecimal result = example.showBug(inputValue);
        System.out.println("Resulting BigDecimal: " + result);
    }
}