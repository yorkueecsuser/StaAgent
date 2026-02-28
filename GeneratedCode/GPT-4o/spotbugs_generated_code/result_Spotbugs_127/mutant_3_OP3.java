class OverwrittenIncrementExample {

    public int showBug(int i) {
        i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        
        // Inserting unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }
        
        return i;
    }

    public int showBug1(int i) {
        i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        
        // Inserting another unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }
        
        return i;
    }

    // Method to ensure the condition is not a compile-time constant
    private boolean getCondition() {
        return false; // Always returns false, making the if statement unreachable
    }

    public static void main(String[] args) {
        OverwrittenIncrementExample example = new OverwrittenIncrementExample();
        
        int result1 = example.showBug(5);
        System.out.println("Result of showBug: " + result1); // Expected output: 5

        int result2 = example.showBug1(5);
        System.out.println("Result of showBug1: " + result2); // Expected output: 5
    }
}