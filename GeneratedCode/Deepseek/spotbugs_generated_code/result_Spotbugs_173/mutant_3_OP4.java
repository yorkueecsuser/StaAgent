class FinalizerBug {
    private boolean getCondition() {
        return false;
    }

    @Override
    public void finalize() {
        // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalizer called");

        // MUTATION: Unreachable if-else statement
        if (getCondition()) {
            System.out.println("This line is unreachable");
        } else {
            // This else block is also unreachable
        }
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