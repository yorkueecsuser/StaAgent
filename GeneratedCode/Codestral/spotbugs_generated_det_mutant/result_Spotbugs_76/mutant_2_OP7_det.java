class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        boolean bgecqtpb = false;while (bgecqtpb && false && true && false && false && false && true && true && false && false && true && false) {String pocaxdyk = "hkkzzhrj";}
        AutoCloseable closeable = () -> {};
        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    
}
}