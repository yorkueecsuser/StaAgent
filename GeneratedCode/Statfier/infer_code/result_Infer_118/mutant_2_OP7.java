public interface JsonType {
    // Introduced an unreachable while loop according to the mutation operator description
    default void introduceUnreachableLoop() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will never return true
        }
    }

    default boolean getCondition() {
        // This method always returns false, ensuring the loop is unreachable
        return false;
    }
}