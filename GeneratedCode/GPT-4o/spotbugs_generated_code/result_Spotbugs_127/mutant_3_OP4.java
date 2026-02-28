class OverwrittenIncrementExample {

    public int showBug(int i) {
        i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        
        // Mutation: Unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            i = i + 10; // This block is unreachable
        } else {
            i = i - 5; // This block is also unreachable
        }
        
        return i;
    }

    public int showBug1(int i) {
        i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        
        // Mutation: Unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            i = i * 2; // This block is unreachable
        } else {
            i = i / 2; // This block is also unreachable
        }
        
        return i;
    }
    
    // Helper method to ensure unreachable code is not detected by the compiler
    private boolean getCondition() {
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