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
        callFutureSet(); // Arbitrary code execution under lock

        // Mutant code: Unreachable if statement
        if (getUnreachableCondition()) {
            // This code block is unreachable
            System.out.println("Unreachable code block");
        }
    }

    public void showBug() {
        example_of_bad_pattern();
    }
}