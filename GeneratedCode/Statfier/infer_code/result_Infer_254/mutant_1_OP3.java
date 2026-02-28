@interface ForUiThread {
    // Adding an unreachable if statement with a dynamic condition
    boolean getCondition() {
        return false; // This method always returns false, but it's not a compile-time constant
    }

    default void checkCondition() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable statement.");
        }
    }
}