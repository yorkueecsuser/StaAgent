class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};

        // Mutation: Inserting unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("Unreachable code");
        }

        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
}