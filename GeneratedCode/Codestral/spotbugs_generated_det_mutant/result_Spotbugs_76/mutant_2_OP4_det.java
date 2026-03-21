class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        if (false && false && true && true && false && true && false && true && false && true && false) {String msntghtb = "ypciaxcd";}else{byte opfasszf = 104;}
        AutoCloseable closeable = () -> {};
        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    
}
}