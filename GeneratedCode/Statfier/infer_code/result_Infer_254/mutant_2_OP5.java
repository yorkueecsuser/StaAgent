@interface ForUiThread {
    // Adding an unreachable switch statement
    default void dummyMethod() {
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case will never be reached because condition is not set to true
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case will also not be reached due to the nature of the condition
                System.out.println("This is also an unreachable case.");
                break;
        }
    }

    default boolean getCondition() {
        // This method returns false, ensuring the switch statement is unreachable
        return false;
    }
}