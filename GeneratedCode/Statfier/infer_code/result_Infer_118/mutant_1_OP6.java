public interface JsonType {
    // Unreachable for loop added as per mutation operator
    boolean getCondition() {
        return false;
    }

    default void someMethod() {
        // Example method to insert the unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() always returns false
        }
    }
}