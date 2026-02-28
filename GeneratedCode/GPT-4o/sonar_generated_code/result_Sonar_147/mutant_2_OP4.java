import java.math.BigDecimal;

class BigDecimalBugExample {
    
    public BigDecimal showBug(double input) {
        BigDecimal bd = new BigDecimal(input); // BUG: "BigDecimal(double)" should not be used
        
        // Introduce an unreachable if-else statement
        boolean condition = calculateCondition(); // This condition method will always return false
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This is the reachable else block.");
        }
        
        return bd;
    }

    // Method to simulate a condition evaluation that returns false
    public boolean calculateCondition() {
        return false;
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        double inputValue = 0.1;
        BigDecimal result = example.showBug(inputValue);
        System.out.println("Resulting BigDecimal: " + result);
    }
}