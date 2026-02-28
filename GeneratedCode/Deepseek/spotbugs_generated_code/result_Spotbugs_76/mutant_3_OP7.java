class UnrelatedInterfaceComparison {
    private boolean getCondition() {
        return false; // This method returns a false condition to make the loop unreachable
    }

    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};

        // Mutated code: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This line will never be executed");
        }

        return runnable.equals(closeable); // Original bug: Comparing different interface types
    }
}