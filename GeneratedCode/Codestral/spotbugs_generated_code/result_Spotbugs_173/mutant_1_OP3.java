class FinalizerBug {
    @Override
    public void finalize() {
        // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalizer called");
    }

    public static boolean getCondition() {
        return false; // This method returns a compile-time constant that makes the if statement unreachable
    }

    public static void showBug() {
        FinalizerBug bugObject = new FinalizerBug();
        bugObject = null;
        System.gc();

        // Mutated Code: Unreachable if statement
        if (getCondition()) {
            System.out.println("This line will never be executed");
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}