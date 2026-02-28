class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};
        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }

    // Mutant code
    public void unreachableSwitch() {
        int value = getFalseValue(); // Dynamically determined at runtime
        switch (value) {
            case 1:
                System.out.println("This line will never be executed.");
                break;
        }
    }

    private int getFalseValue() {
        return 0; // Always returns a value that makes the switch statement unreachable
    }
}