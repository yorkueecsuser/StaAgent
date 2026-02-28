class FinalizerBug {
    @Override
    public void finalize() {
        // BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalizer called");
    }

    public static void showBug() {
        FinalizerBug bugObject = new FinalizerBug();
        bugObject = null;

        // Added Mutant: Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                // This code will never be executed since getValue() never returns 1
                System.out.println("This is an unreachable code block");
                break;
        }

        System.gc();
    }

    private static int getValue() {
        // This method always returns 2, which makes the switch statement in showBug() unreachable
        return 2;
    }

    public static void main(String[] args) {
        showBug();
    }
}