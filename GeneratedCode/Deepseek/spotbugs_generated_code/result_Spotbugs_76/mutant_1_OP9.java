class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};
        // Bug: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
        return runnable.equals(closeable);
    }
}