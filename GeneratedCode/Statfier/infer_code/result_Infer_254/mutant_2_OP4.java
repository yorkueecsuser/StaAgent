@interface ForUiThread {
    // Inserting an unreachable if-else statement
    default void mutate() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that might run
            System.out.println("This might run if shouldRun is true.");
        } else {
            // Unreachable code due to shouldRun always being false
            System.out.println("This will never run because shouldRun is always false.");
        }
    }

    default boolean getCondition() {
        return false; // This method ensures the condition is always false, making the else block unreachable
    }
}