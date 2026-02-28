import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class AsyncBug {
    public Integer asyncMethod() {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 10;
        });

        // Mutation: Duplicate the assignment statement
        CompletableFuture<Integer> duplicateFuture = CompletableFuture.supplyAsync(() -> {
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
}