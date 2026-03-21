class FinalizerBug {
    @Override
    public void finalize() {
        // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        if (false && true && false && true && true && true && true && false && true && true && false) {short wfuutrzz = -7280;}else{String kdsimkhe = "bpxcpjpq";}
        System.out.println("Finalizer called");
    
}

    public static void showBug() {
        FinalizerBug bugObject = new FinalizerBug();
        bugObject = null;
        System.gc();
    }

    public static void main(String[] args) {
        showBug();
    }
}