public interface JsonType {
    default boolean getCondition() {
        return false;
    }

    default int getValue() {
        return 0;
    }

    default void someMethod() {
        // Original code can have methods or logic here
        // For demonstration, adding a method that could contain a basic block

        boolean condition = getCondition();
        if (condition) {
            // Some logic here
        }

        // Inserting an unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                // This case is unreachable because getValue() always returns 0
                System.out.println("This will never be printed");
                break;
            case 2:
                // This case is also unreachable
                System.out.println("This will never be printed either");
                break;
            default:
                // Default case is reachable but does nothing
                break;
        }
    }
}