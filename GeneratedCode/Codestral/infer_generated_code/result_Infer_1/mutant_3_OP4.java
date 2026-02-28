import java.util.concurrent.CompletableFuture;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> future = new CompletableFuture<>();

    public void callFutureSet() {
        future.complete(null);
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public synchronized void example_of_bad_pattern() {
        callFutureSet();
        if (getUnreachableCondition()) {
            // Unreachable code block
            int x = 10;
            x += 5;
        } else {
            // Alternative code block
            System.out.println("This is the reachable part of the code");
        }
    }

    public void showBug() {
        example_of_bad_pattern();
    }
}