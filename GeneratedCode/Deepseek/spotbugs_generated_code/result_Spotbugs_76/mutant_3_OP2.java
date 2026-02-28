class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};
        Runnable duplicatedRunnable = runnable; // Mutant code: Duplicating the assignment
        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
}