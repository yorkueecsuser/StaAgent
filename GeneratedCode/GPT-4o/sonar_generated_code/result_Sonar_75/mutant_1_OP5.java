class DivisionByZeroExample {

    public int showBug(int divisor) {
        // This method demonstrates a division by zero bug
        int result = 0;
        if (divisor != 0) {
            result = 10 / divisor;
        } else {
            result = 10 / divisor; // BUG: Zero should not be a possible denominator
        }
        
        // Mutation: Unreachable switch statement
        int unreachableValue = getUnreachableValue(); // Dynamically get a value
        switch (unreachableValue) {
            case 999:
                System.out.println("This case is unreachable");
                break;
            default:
                // No action needed
                break;
        }
        
        return result;
    }

    // Helper method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        return -1; // Always returns a value not handled by the switch
    }

    public static void main(String[] args) {
        DivisionByZeroExample example = new DivisionByZeroExample();
        // This will demonstrate a division by zero
        int result = example.showBug(0);
        System.out.println("Result: " + result);
    }
}