class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};

        // Mutation: Unreachable for loop
        boolean loopCondition = false;
        for (int i = 0; loopCondition; i++) {
            // This code will never be executed
        }

        return runnable.equals(closeable); // Original bug remains: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
}