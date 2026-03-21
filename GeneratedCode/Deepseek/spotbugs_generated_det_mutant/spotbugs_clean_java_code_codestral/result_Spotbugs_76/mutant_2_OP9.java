class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};

        // Mutation: Equivalent Loop Replacement
        // Although the code does not have a loop, we can still add a do-while loop that doesn't affect the functionality
        do {
            // The loop body is empty as per the original code
        } while (false);

        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
}