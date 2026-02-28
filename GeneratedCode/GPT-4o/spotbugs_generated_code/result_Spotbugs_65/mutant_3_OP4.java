class NonNullReturnViolationExample {

    // Method declared with the intention of being non-null return but may return null
    public String getNonNullString(boolean returnNull) {
        if (returnNull) {
            return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        }
        return "Hello, World!";
    }

    public String showBug(boolean returnNull) {
        boolean condition = getCondition(); // Non-final variable to ensure runtime evaluation
        if (condition) {
            // Unreachable code due to condition being always false
            System.out.println("This will never print.");
        } else {
            System.out.println("This is the reachable branch.");
        }
        return getNonNullString(returnNull);
    }

    private boolean getCondition() {
        return false; // Ensures the if condition is always false, making the branch unreachable
    }

    public static void main(String[] args) {
        NonNullReturnViolationExample example = new NonNullReturnViolationExample();
        // Test case that demonstrates the bug
        System.out.println(example.showBug(true)); // This will cause a NullPointerException in a system that enforces @Nonnull
    }
}