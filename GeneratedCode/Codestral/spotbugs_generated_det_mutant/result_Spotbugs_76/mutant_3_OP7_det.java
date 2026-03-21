class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        boolean wpaignzb = false;while (wpaignzb && false && false && false && true && true && true && false && true && false && true && false) {String omkgpobz = "bfzwvguf";}
        AutoCloseable closeable = () -> {};
        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    
}
}