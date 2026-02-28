class UnrelatedInterfaceComparison {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};

        if (getFalseCondition()) {
            System.out.println("This statement is unreachable");
        }

        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
}