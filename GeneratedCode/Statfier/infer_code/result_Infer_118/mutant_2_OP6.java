public interface JsonType {
    // Adding an unreachable for loop as per the mutation operator description
    default void addUnreachableLoop() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will return false
        }
    }

    default boolean getCondition() {
        return false;
    }
}