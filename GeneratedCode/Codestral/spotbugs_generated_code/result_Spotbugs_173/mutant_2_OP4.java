class FinalizerBug {

    // Original bug: Finalizer should be protected, not public
    @Override
    public void finalize() {
        System.out.println("Finalizer called");
    }

    // Unreachable if-else statement mutation
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void showBug() {
        FinalizerBug bugObject = new FinalizerBug();
        if (bugObject.getUnreachableCondition()) {
            // This code block is unreachable due to the false condition
            System.out.println("Unreachable code block");
        } else {
            // This is the reachable code block
            System.out.println("Reachable code block");
        }
        bugObject = null;
        System.gc();
    }

    public static void main(String[] args) {
        showBug();
    }
}