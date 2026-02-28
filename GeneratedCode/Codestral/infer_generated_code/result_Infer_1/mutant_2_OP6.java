import java.util.concurrent.CompletableFuture;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> future = new CompletableFuture<>();

    public void callFutureSet() {
        future.complete(null);
    }

    private boolean getCondition() {
        return false;
    }

    public synchronized void example_of_bad_pattern() { // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
        callFutureSet();
        for (int i = 0; getCondition(); i++) { // Unreachable for loop
            System.out.println("This loop is unreachable.");
        }
    }

    public void showBug() {
        example_of_bad_pattern();
    }
}