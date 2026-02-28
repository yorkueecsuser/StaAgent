class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};

        // Mutant code: Unreachable switch statement
        boolean unreachableCondition = runnable.equals(closeable);
        int value = unreachableCondition? 1 : 0;
        switch(value) {
            case 2:
                System.out.println("This line should never be reached");
                break;
        }

        return unreachableCondition; // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
}