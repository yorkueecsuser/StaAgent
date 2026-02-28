@interface ForUiThread {
    // Inserting an unreachable while loop
    default void insertUnreachableLoop() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will always return false
        }
    }

    default boolean getCondition() {
        return false;
    }
}