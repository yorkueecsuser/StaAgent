import java.util.concurrent.CompletableFuture;
import java.util.Random;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> future = new CompletableFuture<>();

    public void callFutureSet() {
        future.complete(null);
    }

    public synchronized void example_of_bad_pattern() {
        // Dead store mutation
        int deadVariable = generateRandomNumber(); // Unused variable

        callFutureSet(); // Arbitrary code execution under lock
    }

    public void showBug() {
        example_of_bad_pattern();
    }

    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}