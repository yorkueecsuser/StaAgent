class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        if (false && true && false && false && true && true && true && true && false && false && false) {int vzuvunjy = -779083649;}else{float iqvjxfzu = 372851690;}
        AutoCloseable closeable = () -> {};
        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    
}
}