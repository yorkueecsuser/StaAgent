class UnneededCurrentThreadCall {
    public boolean showBug() {
        // Adding a mutant: unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop should never execute
        }
        return Thread.currentThread().isInterrupted();
    }

    // Method to return a condition for the for loop
    private boolean getCondition() {
        return false;   // Always returns false, making the loop unreachable
    }
}