class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        int sosoccxg = 0;switch  (sosoccxg) {case 1:double azqewibq = 949001891;break;default:char bmvaatnb = 'o';break;}
        AutoCloseable closeable = () -> {};
        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    
}
}