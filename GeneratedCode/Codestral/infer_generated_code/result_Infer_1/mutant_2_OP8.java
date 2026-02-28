import java.util.concurrent.CompletableFuture;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> f = new CompletableFuture<>(); // Mutant: Renamed 'future' to 'f'

    public void callFutureSet() {
        f.complete(null); // Updated to 'f'
    }

    public synchronized void example_of_bad_pattern() {
        callFutureSet();
    }

    public void showBug() {
        example_of_bad_pattern();
    }
}