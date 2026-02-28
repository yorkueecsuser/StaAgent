class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        // Accessing unwrittenField will return the default value of int, which is 0
        
        // Inserting unreachable if-else branch
        boolean condition = getCondition(); // This is a non-final variable
        if (condition) {
            // This block is never executed
            System.out.println("This message will never be printed.");
        } else {
            // The original return statement remains intact
            return unwrittenField;
        }
        
        // Returning the unwritten field
        return unwrittenField;
    }

    // Method to simulate a condition that always returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());
    }
}