class FinalizerBug {
    @Override
    public void finalize() {
        // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        boolean condition = getConditionForLoop(); // Using dynamic condition to avoid unreachable loop error
        for (int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("Unreachable loop iteration: " + i);
        }
        System.out.println("Finalizer called");
    }

    public static boolean getConditionForLoop() {
        return false; // Always false to make the loop unreachable
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