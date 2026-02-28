@interface ForNonUiThread {
    // Adding an unreachable switch statement
    boolean getCondition() {
        return false;
    }

    default void someMethod() {
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is unreachable because getCondition() always returns false
                System.out.println("This will never be printed.");
                break;
            default:
                // Default case is also unreachable for the same reason
                System.out.println("This will also never be printed.");
                break;
        }
    }
}