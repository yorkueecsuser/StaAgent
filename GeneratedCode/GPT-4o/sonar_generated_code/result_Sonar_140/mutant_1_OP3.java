class IncrementBugExample {
    
    public int showBug(int initialValue) {
        int i = initialValue;
        int j = initialValue;

        // Unreachable if branch inserted here
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    }

    // Helper method to provide a non-final condition for the unreachable if statement
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        
        // Example usage
        System.out.println("Result: " + example.showBug(0));
    }
}