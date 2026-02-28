import java.util.concurrent.CompletableFuture;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> future = new CompletableFuture<>();

    public void callFutureSet() {
        future.complete(null);
    }

    public synchronized void example_of_bad_pattern() {
        callFutureSet(); // Original call
        future.complete(null); // Duplicated call
    }

    public void showBug() {
        example_of_bad_pattern();
    }
}