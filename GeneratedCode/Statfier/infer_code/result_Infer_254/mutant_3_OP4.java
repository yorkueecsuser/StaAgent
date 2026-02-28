@interface ForUiThread {
    // Original code remains intact

    // Inserted unreachable if-else statement
    boolean getCondition() {
        return false;
    }

    default void checkCondition() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because getCondition() always returns false
            System.out.println("This is the unreachable if block.");
        } else {
            // This block will always execute
            System.out.println("This is the reachable else block.");
        }
    }
}