@interface ForNonUiThread {
    // Adding an unreachable if-else statement
    default void mutate() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that might run if shouldRun is true
            System.out.println("This might execute if shouldRun is true.");
        } else {
            // This is the unreachable block
            System.out.println("This will never execute because shouldRun is always false.");
        }
    }

    default boolean getCondition() {
        return false; // This method always returns false, making the else block unreachable
    }
}