@interface ForUiThread {
    // Inserting an unreachable while loop
    default void dummyMethod() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will return false
        }
    }

    default boolean getCondition() {
        return false;
    }
}