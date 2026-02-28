class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};
        int unusedVariable; // Dead Store mutation
        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
}