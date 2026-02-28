class UnneededCurrentThreadCall {
    public boolean showBug() {
        boolean shouldRun = Thread.interrupted(); // Mutated based on the mutation operator
        if (shouldRun) {
            return shouldRun;
        } else {
            boolean unreachableCondition = false; // To ensure unreachable code is added
            if (unreachableCondition) {
                System.out.println("This block is unreachable");
            }
            return Thread.currentThread().isInterrupted(); // Original bug left unchanged
        }
    }
}