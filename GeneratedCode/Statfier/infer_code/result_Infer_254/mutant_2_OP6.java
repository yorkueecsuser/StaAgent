@interface ForUiThread {
    // Inserting an unreachable for loop according to the mutation operator
    boolean getCondition() {
        return false;
    }

    default void insertUnreachableLoop() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
        }
    }
}