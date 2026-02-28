import java.util.concurrent.CompletableFuture;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> future = new CompletableFuture<>();

    public void callFutureSet() {
        future.complete(null);
    }

    public boolean getCondition() {
        return false;
    }

    public synchronized void example_of_bad_pattern() {
        callFutureSet();
        while (getCondition()) { // Inserted unreachable while loop
            // This code will never be executed
        }
    }

    public void showBug() {
        example_of_bad_pattern();
    }
}