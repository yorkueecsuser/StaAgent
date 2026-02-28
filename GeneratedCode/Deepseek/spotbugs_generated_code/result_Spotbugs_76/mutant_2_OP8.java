class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable r = () -> {};
        AutoCloseable a = () -> {};
        return r.equals(a); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
}