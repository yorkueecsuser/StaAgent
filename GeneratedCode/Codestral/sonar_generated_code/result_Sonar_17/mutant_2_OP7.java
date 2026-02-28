import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class AsyncBug {
    public Integer asyncMethod() {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            // Mutation: Inserting unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This code block is unreachable
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 10;
        });
        try {
            return future.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public Integer showBug() {
        return asyncMethod();
    }

    // Helper method to return a non-compile-time constant
    private boolean getCondition() {
        return false;
    }
}