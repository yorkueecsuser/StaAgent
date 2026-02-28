@interface ForUiThread {
    // Inserting an unreachable while loop
    default void insertUnreachableLoop() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() should return false
        }
    }

    default boolean getCondition() {
        return false; // This method ensures the condition is false, making the loop unreachable
    }
}