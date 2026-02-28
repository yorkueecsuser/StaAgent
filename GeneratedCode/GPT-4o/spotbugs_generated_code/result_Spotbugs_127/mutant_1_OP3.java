class OverwrittenIncrementExample {

    public int showBug(int i) {
        i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        
        // Mutation: Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never print");
        }
        
        return i;
    }

    public int showBug1(int i) {
        i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        
        // Mutation: Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never print");
        }
        
        return i;
    }

    // Helper method to ensure the condition is dynamically determined
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        OverwrittenIncrementExample example = new OverwrittenIncrementExample();
        
        int result1 = example.showBug(5);
        System.out.println("Result of showBug: " + result1); // Expected output: 5

        int result2 = example.showBug1(5);
        System.out.println("Result of showBug1: " + result2); // Expected output: 5
    }
}