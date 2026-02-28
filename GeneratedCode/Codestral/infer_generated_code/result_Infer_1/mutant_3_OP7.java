import java.util.concurrent.CompletableFuture;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> future = new CompletableFuture<>();

    public void callFutureSet() {
        future.complete(null);
    }

    public synchronized void example_of_bad_pattern() { // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
        callFutureSet(); // Arbitrary code execution under lock

        // Mutation: Unreachable while loop
        boolean condition = getCondition();
        while (!condition) {
            // This code is unreachable, but added to demonstrate the mutant effect
            int x = 10;
            x++;
        }
    }

    // Helper method to return a condition
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        example_of_bad_pattern();
    }
}