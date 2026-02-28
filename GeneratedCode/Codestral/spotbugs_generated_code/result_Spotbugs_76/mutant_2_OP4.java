class UnrelatedInterfaceComparison {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};

        boolean condition = getCondition();
        if (condition) {
            // Unreachable code due to condition being always false
            return runnable.equals(closeable);
        } else {
            // Original bug-inducing code
            return runnable.equals(closeable);
        }
    }
}