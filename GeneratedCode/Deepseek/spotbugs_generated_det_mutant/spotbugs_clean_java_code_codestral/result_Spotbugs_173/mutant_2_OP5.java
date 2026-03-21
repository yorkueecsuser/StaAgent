class FinalizerBug {
    @Override
    public void finalize() {
        // Original bug: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
        System.out.println("Finalizer called");
    }

    private static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        FinalizerBug bugObject = new FinalizerBug();
        // Mutation: Unreachable switch statement
        switch (getCondition()) {
            case true:
                // This block should be unreachable
                System.out.println("Unreachable code");
                break;
        }
        bugObject = null;
        System.gc();
    }

    public static void main(String[] args) {
        showBug();
    }
}