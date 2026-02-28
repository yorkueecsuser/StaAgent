import java.util.concurrent.CompletableFuture;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> future = new CompletableFuture<>();

    public void callFutureSet() {
        future.complete(null);
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public synchronized void example_of_bad_pattern() { // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
        callFutureSet(); // Arbitrary code execution under lock

        // Mutant: Unreachable if statement
        if (getUnreachableCondition()) {
            // This block of code is unreachable
            int x = 10;
            System.out.println("Unreachable code executed");
        }
    }

    public void showBug() {
        example_of_bad_pattern();
    }
}