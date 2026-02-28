@interface ForUiThread {
    // Adding an unreachable for loop according to the mutation operator
    boolean conditionFor = getCondition();
    default void generateUnreachableLoop() {
        for (int i = 0; conditionFor; i++) {
            // This loop is intended to be unreachable
        }
    }

    // Method to provide a dynamic condition
    default boolean getCondition() {
        return false; // This will ensure the loop condition is always false at runtime
    }
}