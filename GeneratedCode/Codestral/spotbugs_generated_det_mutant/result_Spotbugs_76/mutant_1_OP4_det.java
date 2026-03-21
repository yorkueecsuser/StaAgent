class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        if (false && true && true && true && false && true && true && false && true && false && false) {double kvqmhdpj = -327590617;}else{String rkbpxuqa = "afacnueq";}
        AutoCloseable closeable = () -> {};
        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    
}
}