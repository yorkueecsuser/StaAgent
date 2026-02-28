class IncrementBugExample {
    
    public int showBug(int initialValue) {
        int i = initialValue;
        int j = initialValue;

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        
        // Example usage
        System.out.println("Result: " + example.showBug(0));
        
        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This code is unreachable.");
        }
    }
    
    // Method to simulate a condition that is determined at runtime
    private static boolean getCondition() {
        return false;
    }
}