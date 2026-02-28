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
        
        // Adding an unreachable for-loop
        boolean conditionFor = getFalseCondition();
        for (int k = 0; conditionFor; k++) {
            // This code is never reached
            System.out.println("This is unreachable code.");
        }
    }
    
    // Method to get a false condition
    public static boolean getFalseCondition() {
        return false;
    }
}