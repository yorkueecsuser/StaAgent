class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};

        // Unreachable if-else statement mutant
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This line will never be executed.");
        } else {
            // Original code
            return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
        }
    }

    // Dummy method to avoid compile-time error
    private boolean getCondition() {
        return false;
    }
}