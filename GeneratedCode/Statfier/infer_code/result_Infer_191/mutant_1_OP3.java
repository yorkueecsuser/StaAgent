@interface ForNonUiThread {
    // Inserting an unreachable if statement
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void someMethod() {
        // Example method to demonstrate insertion of unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable statement.");
        }
    }
}