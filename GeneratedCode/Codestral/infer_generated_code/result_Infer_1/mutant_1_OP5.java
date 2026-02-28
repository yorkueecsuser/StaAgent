import java.util.concurrent.CompletableFuture;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> future = new CompletableFuture<>();

    public void callFutureSet() {
        future.complete(null);
    }

    public int getUnreachableValue() {
        return 0;
    }

    public synchronized void example_of_bad_pattern() {
        callFutureSet();

        int value = getUnreachableValue();
        switch(value) {
            case 1:
                // Unreachable code
                break;
        }
    }

    public void showBug() {
        example_of_bad_pattern();
    }
}