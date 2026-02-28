class UnrelatedInterfaceComparison {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};

        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This line should never be executed");
        } else {
            // Original code
            return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
        }
    }
}