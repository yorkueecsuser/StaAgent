class UnneededCurrentThreadCall {
    public boolean showBug() {
        boolean shouldNotExecute = false;
        if (shouldNotExecute) {
            // Unreachable if-else branch
            return Thread.currentThread().isInterrupted();
        } else {
            // Original code
            return Thread.currentThread().isInterrupted();
        }
    }

    // Method to dynamically determine the condition
    private boolean getCondition() {
        // Implement your logic here
        return false;
    }
}