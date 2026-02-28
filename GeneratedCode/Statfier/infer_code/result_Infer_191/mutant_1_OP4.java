@interface ForNonUiThread {
    // Adding an unreachable if-else statement
    default void mutate() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that will run if shouldRun is true
            System.out.println("This code runs if shouldRun is true.");
        } else {
            // This is the unreachable branch
            System.out.println("This code is unreachable.");
        }
    }

    default boolean getCondition() {
        return true; // Always returns true to ensure the if branch is taken
    }
}