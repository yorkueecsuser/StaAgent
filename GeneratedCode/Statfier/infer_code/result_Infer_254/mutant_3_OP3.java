@interface ForUiThread {
    // Unreachable if statement mutation
    boolean getCondition() {
        return false;
    }

    default void someMethod() {
        // Original code remains intact
        System.out.println("This is a method in the annotation interface.");

        // Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This is an unreachable block.");
        }
    }
}