class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};

        while (getCondition()) {  // Mutant code: Unreachable while loop
            // This block will never execute because getCondition() always returns false
        }

        return runnable.equals(closeable); // Original bug: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }

    private boolean getCondition() {
        return false;  // This method always returns false to make the while loop unreachable
    }
}