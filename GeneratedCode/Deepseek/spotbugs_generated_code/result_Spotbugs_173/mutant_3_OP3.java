class FinalizerBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    @Override
    public void finalize() {
        // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        if (getUnreachableCondition()) {
            // Unreachable if statement as per mutation operator
            System.out.println("This code should never be executed");
        }
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