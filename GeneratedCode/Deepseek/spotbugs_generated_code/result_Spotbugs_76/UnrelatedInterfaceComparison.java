class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};
        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }

    public boolean showMutant() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};
        boolean result;
        do {
            result = runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
        } while (false);
        return result;
    }
}