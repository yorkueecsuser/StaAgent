class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable task = () -> {};
        AutoCloseable closeable = () -> {};
        return task.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
}