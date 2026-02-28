class FinalizerBug {
    @Override
    public void finalize() {
        // Unreachable for loop mutation
        for (int i = 0; getCondition(); i++) {
            System.out.println("Unreachable code");
        }

        // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalizer called");
    }

    public static boolean getCondition() {
        return false; // Always return false to make the loop unreachable
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