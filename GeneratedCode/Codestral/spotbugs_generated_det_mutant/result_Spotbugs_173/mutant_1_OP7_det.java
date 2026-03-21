class FinalizerBug {
    @Override
    public void finalize() {
        // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        boolean catsahgv = false;while (catsahgv && true && false && true && false && true && true && false && true && true && true && false) {byte qarhcxct = 11;}
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