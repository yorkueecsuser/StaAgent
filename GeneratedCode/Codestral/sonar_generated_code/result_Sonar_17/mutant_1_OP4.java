import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class AsyncBug {
    // BUG: Async methods should return void or Future
    public Integer asyncMethod() {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 10;
        });
        try {
            // Mutant Code: Unreachable if-else statement
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                throw new RuntimeException("This should never happen");
            } else {
                return future.get();
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public Integer showBug() {
        return asyncMethod();
    }

    // Method to generate the unreachable condition
    private boolean getUnreachableCondition() {
        // Always return false to make the condition unreachable
        return false;
    }
}