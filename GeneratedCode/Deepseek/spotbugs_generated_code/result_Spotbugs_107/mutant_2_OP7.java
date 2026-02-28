class UnneededCurrentThreadCall {
    public boolean showBug() {
        boolean unreachableCondition = false; // The condition is always false
        while (unreachableCondition) {
            // This code will never be executed.
            System.out.println("Unreachable code");
        }
        return Thread.currentThread().isInterrupted();
    }
}