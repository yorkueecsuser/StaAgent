class DivisionByZeroExample {

    public int showBug(int divisor) {
        // This method demonstrates a division by zero bug
        int result = 0;
        if (divisor != 0) {
            result = 10 / divisor;
        } else {
            result = 10 / divisor; // BUG: Zero should not be a possible denominator
        }
        
        // Mutant: Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This code is unreachable because condition is always false.");
        }

        return result;
    }

    public static void main(String[] args) {
        DivisionByZeroExample example = new DivisionByZeroExample();
        // This will demonstrate a division by zero
        int result = example.showBug(0);
        System.out.println("Result: " + result);
    }
    
    // Helper method to ensure the condition is always false at runtime
    private boolean getFalseCondition() {
        return false;
    }
}