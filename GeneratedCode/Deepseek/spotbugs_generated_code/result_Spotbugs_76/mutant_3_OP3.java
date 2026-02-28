class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};

        // Mutant Code Added for Unreachable If Statement
        boolean unreachableCondition = falseCondition();
        if (unreachableCondition) {
            System.out.println("This line should never print.");
        }

        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }

    private boolean falseCondition() {
        return false;
    }
}