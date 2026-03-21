class FinalizerBug {
    // Bug remains: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
    @Override
    public void finalize() {
        // Mutation: Unreachable while loop
        while (getFalseCondition()) {
            // This code is unreachable
            System.out.println("This is an unreachable loop");
        }
        System.out.println("Finalizer called");
    }

    public static boolean getFalseCondition() {
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