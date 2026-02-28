class DivisionByZeroExample {

    public int showBug(int divisor) {
        // This method demonstrates a division by zero bug
        int result = 0;
        if (divisor != 0) {
            result = 10 / divisor;
        } else {
            result = 10 / divisor; // BUG: Zero should not be a possible denominator
        }
        
        // Inserted unreachable while loop
        boolean conditionWhile = getCondition(); // This method ensures the condition is dynamically determined
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }
        
        return result;
    }

    // Method to ensure the condition is dynamically determined at runtime
    public boolean getCondition() {
        return false; // This method always returns false, making the while loop condition false
    }

    public static void main(String[] args) {
        DivisionByZeroExample example = new DivisionByZeroExample();
        // This will demonstrate a division by zero
        int result = example.showBug(0);
        System.out.println("Result: " + result);
    }
}