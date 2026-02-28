import java.util.concurrent.CompletableFuture;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> f = new CompletableFuture<>();

    public void callFutureSet() {
        f.complete(null);
    }

    public synchronized void example_of_bad_pattern() { // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
        callFutureSet(); // Arbitrary code execution under lock
    }

    public void showBug() {
        example_of_bad_pattern();
    }
}