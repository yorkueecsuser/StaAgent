import java.util.concurrent.CompletableFuture;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> future = new CompletableFuture<>();

    public void callFutureSet() {
        future.complete(null);
    }

    public synchronized void example_of_bad_pattern() {
        callFutureSet();
        int value = 0; // Non-final variable for the switch expression
        switch (value) { // Unreachable switch statement
            case 1:
                System.out.println("This code should never execute");
                break;
        }
    }

    public void showBug() {
        example_of_bad_pattern();
    }
}