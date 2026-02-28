class FinalizerBug {
    @Override
    public void finalize() {
        // Original Bug: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalizer called");

        // Mutated Code: Inserting unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("Unreachable code");
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