@interface ForNonUiThread {
    // Introducing an unreachable if-else statement
    default void mutate() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that might run
            System.out.println("This code might execute if shouldRun is true.");
        } else {
            // Unreachable code due to shouldRun always being false in this context
            System.out.println("This code will never execute.");
        }
    }

    default boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}