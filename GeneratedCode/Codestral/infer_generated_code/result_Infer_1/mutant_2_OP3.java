import java.util.concurrent.CompletableFuture;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> future = new CompletableFuture<>();

    public void callFutureSet() {
        future.complete(null);
    }

    public synchronized void example_of_bad_pattern() { // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
        callFutureSet(); // Arbitrary code execution under lock

        // Mutant: Unreachable if statement
        boolean isFalse = getFalseCondition();
        if (isFalse) {
            // This block of code is unreachable
            System.out.println("This line should not be executed.");
        }
    }

    public boolean getFalseCondition() {
        return false; // This method always returns false
    }

    public void showBug() {
        example_of_bad_pattern();
    }
}