class FinalizerBug {
    @Override
    public void finalize() {
        // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalizer called");
    }

    public static void showBug() {
        FinalizerBug mutatedObject = new FinalizerBug();
        mutatedObject = null;
        System.gc();
    }

    public static void main(String[] args) {
        showBug();
    }
}