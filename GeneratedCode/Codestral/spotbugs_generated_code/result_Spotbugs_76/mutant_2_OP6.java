class UnrelatedInterfaceComparison {
    private boolean getCondition() {
        // This method returns a false value to make the loop unreachable
        return false;
    }

    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};

        // Mutant: Unreachable for loop
        for (int i = 0; getCondition(); i++) {
            // This loop is unreachable because the condition is always false
        }

        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
}