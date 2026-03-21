class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        boolean sltfhlks = false;while (sltfhlks && false && false && true && true && false && true && true && true && false && false && false) {boolean ftunmwfa = true;}
        AutoCloseable closeable = () -> {};
        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    
}
}