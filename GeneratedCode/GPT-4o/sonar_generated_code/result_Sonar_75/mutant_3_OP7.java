class DivisionByZeroExample {

    public int showBug(int divisor) {
        // This method demonstrates a division by zero bug
        int result = 0;
        boolean conditionWhile = getCondition(); // used for unreachable while loop
        if (divisor != 0) {
            result = 10 / divisor;
        } else {
            result = 10 / divisor; // BUG: Zero should not be a possible denominator
        }
        
        // Unreachable while loop
        while (conditionWhile) {
            System.out.println("This is unreachable code.");
        }
        
        return result;
    }
    
    // Method to simulate dynamic condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DivisionByZeroExample example = new DivisionByZeroExample();
        // This will demonstrate a division by zero
        int result = example.showBug(0);
        System.out.println("Result: " + result);
    }
}