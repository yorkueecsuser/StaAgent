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
        
        // Unreachable if-else branch
        boolean condition = getFalseCondition(); 
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This is the else branch.");
        }
    }
    
    // Method to return false dynamically
    private static boolean getFalseCondition() {
        return false;
    }
}