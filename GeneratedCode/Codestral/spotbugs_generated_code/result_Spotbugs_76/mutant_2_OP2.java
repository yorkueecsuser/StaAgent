class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};
        Runnable duplicateRunnable = runnable; // Mutated code: Duplicating the assignment statement
        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
}