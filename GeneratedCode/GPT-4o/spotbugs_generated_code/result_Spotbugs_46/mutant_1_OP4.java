class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        // Accessing unwrittenField will return the default value of int, which is 0

        // Mutation: Adding unreachable if-else statement
        boolean condition = getCondition(); // Using a method to ensure runtime evaluation
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the else branch of an unreachable if-else statement.");
        }

        return unwrittenField;
    }

    // Method to avoid compile-time constant condition
    private boolean getCondition() {
        return false; // Ensures the 'if' branch is never taken
    }

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());
    }
}