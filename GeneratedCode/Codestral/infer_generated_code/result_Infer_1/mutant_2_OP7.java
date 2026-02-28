import java.util.concurrent.CompletableFuture;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> future = new CompletableFuture<>();

    public void callFutureSet() {
        future.complete(null);
    }

    public synchronized void example_of_bad_pattern() {
        boolean condition = getCondition();
        while (condition) { // Unreachable while loop mutation operator
            // This loop is unreachable because the condition is always false
            // But it's dynamically determined at runtime to avoid compile errors
        }
        callFutureSet();
    }

    public boolean getCondition() {
        return false; // The condition is always false, making the loop unreachable
    }

    public void showBug() {
        example_of_bad_pattern();
    }
}