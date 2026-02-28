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

        // Unreachable switch statement
        boolean condition = false;
        if (condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    // Unreachable code
                    System.out.println("Unreachable code");
                    break;
            }
        }

        try {
            return future.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    // Helper method for getting a value
    private int getValue() {
        return 0;
    }

    public Integer showBug() {
        return asyncMethod();
    }
}