class IncrementBugExample {
    
    public int showBug(int initialValue) {
        int i = initialValue;
        int j = initialValue;

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    }

    private boolean getCondition() {
        return false; // This method returns a non-final boolean value
    }
    
    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        
        // Inserting an unreachable while loop
        boolean conditionWhile = example.getCondition();
        while (conditionWhile) {
            System.out.println("This will never be printed."); // Unreachable code
        }
        
        // Example usage
        System.out.println("Result: " + example.showBug(0));
    }
}