class UnrelatedInterfaceComparison {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};

        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This branch is unreachable");
        } else {
            return runnable.equals(closeable); // The original bug is preserved
        }

        return false; // Added to avoid compilation errors
    }
}