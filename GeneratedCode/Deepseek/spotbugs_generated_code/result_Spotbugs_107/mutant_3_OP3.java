class UnneededCurrentThreadCall {
    public boolean showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should not be executed.");
        }
        return Thread.currentThread().isInterrupted(); // Original bug is still present
    }
}