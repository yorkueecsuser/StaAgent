import java.util.concurrent.CompletableFuture;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> future = new CompletableFuture<>();

    public void callFutureSet() {
        future.complete(null);
    }

    public synchronized void example_of_bad_pattern() {
        boolean shouldRun = getCondition();

        if (shouldRun) {
            callFutureSet();
        } else {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    public boolean getCondition() {
        return false;
    }

    public void showBug() {
        example_of_bad_pattern();
    }
}