public interface JsonType {
    // Inserting an unreachable while loop
    default void someMethod() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() should return false
        }
    }

    default boolean getCondition() {
        return false;
    }
}