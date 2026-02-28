import java.util.concurrent.CompletableFuture;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> a = new CompletableFuture<>();

    public void callFutureSet() {
        a.complete(null);
    }

    public synchronized void example_of_bad_pattern() {
        callFutureSet(); // Arbitrary code execution under lock
    }

    public void showBug() {
        example_of_bad_pattern();
    }
}