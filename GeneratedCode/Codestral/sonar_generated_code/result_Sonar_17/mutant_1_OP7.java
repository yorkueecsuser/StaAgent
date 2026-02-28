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
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This while loop is unreachable as conditionWhile is always false
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

    private boolean getCondition() {
        return false;
    }
}