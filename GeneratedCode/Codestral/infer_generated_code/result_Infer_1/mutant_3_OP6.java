import java.util.concurrent.CompletableFuture;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> future = new CompletableFuture<>();

    public void callFutureSet() {
        future.complete(null);
    }

    public synchronized void example_of_bad_pattern() {
        callFutureSet();

        boolean condition = false;
        for (int i = 0; condition; i++) {
            // This code will never execute
        }
    }

    public void showBug() {
        example_of_bad_pattern();
    }
}