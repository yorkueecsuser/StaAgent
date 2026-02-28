class ConstantOverflowExample {

    // Intent was for the multiplication expression to be evaluated as a long instead of an int.
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        // Unreachable if-else statement mutation
        boolean isUnreachable = getCondition(); // Non-final variable to determine condition
        if (isUnreachable) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("Executing else branch because the condition is unreachable.");
        }
        return NANOS_PER_DAY;
    }
    
    // Method to return a dynamically determined false condition
    private boolean getCondition() {
        return false; // Ensures the if branch is never executed
    }

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        System.out.println("NANOS_PER_DAY with bug: " + example.showBug());
    }
}