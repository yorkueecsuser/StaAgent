import java.util.concurrent.CompletableFuture;
import java.util.Random;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> future = new CompletableFuture<>();

    public void callFutureSet() {
        future.complete(null);
    }

    public synchronized void example_of_bad_pattern() {
        int deadStoreVariable;  // Mutation: Dead Store
        deadStoreVariable = new Random().nextInt();  // Initialize the variable to avoid unreachable statement error
        callFutureSet(); // Arbitrary code execution under lock
    }

    public void showBug() {
        example_of_bad_pattern();
    }
}