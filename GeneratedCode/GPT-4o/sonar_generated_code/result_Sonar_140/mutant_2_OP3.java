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

        // Unreachable if statement mutation
        boolean isConditionMet = isConditionMet();
        if (isConditionMet) {
            System.out.println("This line will never be executed.");
        }
    }

    // Method to ensure the condition is always false, avoiding unreachable statement issues
    private static boolean isConditionMet() {
        return false;
    }
}