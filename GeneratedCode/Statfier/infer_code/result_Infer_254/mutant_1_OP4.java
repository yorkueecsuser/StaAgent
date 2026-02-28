@interface ForUiThread {
    // Inserting an unreachable if-else statement
    default void mutate() {
        boolean condition = getCondition();
        if (condition) {
            // Some code that will run if condition is true
        } else {
            // Unreachable code due to condition always being false at runtime
        }
    }

    default boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }
}