class FinalizerBug {
    @Override
    public void finalize() {
        // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop inserted
            System.out.println("Unreachable statement");
        }
        System.out.println("Finalizer called");
    }

    public static boolean getCondition() {
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