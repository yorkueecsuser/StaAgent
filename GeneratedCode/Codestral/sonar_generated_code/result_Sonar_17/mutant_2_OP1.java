import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.Random;

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
            // Mutant: Dead store - adding an unused variable declaration
            int deadStoreVariable = generateRandomNumber();
            return future.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public Integer showBug() {
        return asyncMethod();
    }

    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}