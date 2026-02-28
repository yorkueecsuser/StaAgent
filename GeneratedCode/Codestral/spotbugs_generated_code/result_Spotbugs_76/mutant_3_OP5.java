class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable runnable = () -> {};
        AutoCloseable closeable = () -> {};

        boolean alwaysFalse = getCondition();
        switch(alwaysFalse? 1 : 0) {
            case 1:
                // Unreachable code
                System.out.println("This line should not execute.");
                break;
        }

        return runnable.equals(closeable); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }

    private boolean getCondition() {
        return false;
    }
}