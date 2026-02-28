class FinalizerBug {
    @Override
    public void finalize() {
        // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        boolean loopCondition = shouldLoop();
        while (loopCondition) {  // Unreachable while loop
            // This loop will never be executed as shouldLoop() always returns false
        }
        System.out.println("Finalizer called");
    }

    private static boolean shouldLoop() {
        return false;
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