@interface ForNonUiThread {
    // Unreachable for loop added as per mutation operator description
    boolean conditionFor = getCondition();
    default boolean getCondition() {
        return false;
    }
    
    default void addUnreachableLoop() {
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
        }
    }
}