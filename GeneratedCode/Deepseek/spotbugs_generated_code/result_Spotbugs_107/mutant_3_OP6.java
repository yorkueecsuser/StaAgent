class UnneededCurrentThreadCall {
    public boolean showBug() {
        // Original code
        boolean isInterrupted = Thread.currentThread().isInterrupted();

        // Adding unreachable for loop
        boolean unreachableCondition = getFalseCondition(); // Dynamically determined false condition
        for (int i = 0; unreachableCondition; i++) {
            // This code will never execute
        }

        return isInterrupted; // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    }

    // Dynamically determined false condition
    private boolean getFalseCondition() {
        return false;
    }
}