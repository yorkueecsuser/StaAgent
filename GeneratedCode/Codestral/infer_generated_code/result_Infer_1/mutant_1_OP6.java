import java.util.concurrent.CompletableFuture;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> future = new CompletableFuture<>();

    public void callFutureSet() {
        future.complete(null);
    }

    public synchronized void example_of_bad_pattern() {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            System.out.println("This line will never be executed");
        }
        callFutureSet(); // Arbitrary code execution under lock
    }

    public void showBug() {
        example_of_bad_pattern();
    }
}