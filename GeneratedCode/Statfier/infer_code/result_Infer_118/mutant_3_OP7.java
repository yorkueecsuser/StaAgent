public interface JsonType {
    // Unreachable while loop mutant
    default void dummyMethod() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() should return false
        }
    }

    default boolean getCondition() {
        return false;
    }
}