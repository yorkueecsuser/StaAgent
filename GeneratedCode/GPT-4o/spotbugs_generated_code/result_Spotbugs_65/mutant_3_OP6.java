class NonNullReturnViolationExample {

    // Method declared with the intention of being non-null return but may return null
    public String getNonNullString(boolean returnNull) {
        if (returnNull) {
            return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        }

        // Unreachable for loop mutation
        boolean loopCondition = getLoopCondition(); // Dynamically determined at runtime
        for (int i = 0; loopCondition; i++) {
            System.out.println("This loop is unreachable");
        }

        return "Hello, World!";
    }

    private boolean getLoopCondition() {
        return false; // This makes the for loop condition false at runtime
    }

    public String showBug(boolean returnNull) {
        return getNonNullString(returnNull);
    }

    public static void main(String[] args) {
        NonNullReturnViolationExample example = new NonNullReturnViolationExample();
        // Test case that demonstrates the bug
        System.out.println(example.showBug(true)); // This will cause a NullPointerException in a system that enforces @Nonnull
    }
}