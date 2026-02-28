@interface ForUiThread {
    // Unreachable if statement mutation
    boolean getCondition() {
        return false;
    }

    default void checkCondition() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable block.");
        }
    }
}