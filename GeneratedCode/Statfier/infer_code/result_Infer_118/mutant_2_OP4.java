public interface JsonType {
    // Original code remains intact

    // Mutant code added
    default void mutantMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if shouldRun is true
            System.out.println("This code runs if shouldRun is true.");
        } else {
            // Unreachable code due to the condition always being false
            System.out.println("This code is unreachable.");
        }
    }

    default boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}