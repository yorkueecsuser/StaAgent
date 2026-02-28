class IncrementBugExample {

    public int showBug(int initialValue) {
        int i = initialValue;
        int j = initialValue;

        // Inserting an unreachable if-else statement
        boolean condition = getFalseCondition(); // This method will always return false
        if (condition) {
            System.out.println("This is unreachable code inside if.");
        } else {
            System.out.println("This is unreachable code inside else.");
        }

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    }

    // Method to simulate a condition that always returns false
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        
        // Example usage
        System.out.println("Result: " + example.showBug(0));
    }
}