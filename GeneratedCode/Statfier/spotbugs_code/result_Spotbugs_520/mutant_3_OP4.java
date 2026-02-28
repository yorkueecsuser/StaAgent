class CloneIdiom1 implements Cloneable {
    // Original code remains intact

    // Mutated code added below
    public void someMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code here
        } else {
            // Unreachable else branch
            System.out.println("This is an unreachable else branch.");
        }
    }

    private boolean getCondition() {
        // This method should return a condition that is dynamically determined at runtime
        return false; // This return value does not affect the reachability of the else branch
    }
}