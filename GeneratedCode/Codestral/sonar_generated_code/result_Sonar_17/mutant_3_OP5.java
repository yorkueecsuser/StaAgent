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

        // Inserted unreachable switch statement
        boolean condition = getCondition();
        if (condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    // This code will never be reached
                    System.out.println("This is an unreachable switch statement");
                    break;
            }
        }

        try {
            return future.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean getCondition() {
        // Replace this with your own logic to determine the condition
        return false;
    }

    private int getValue() {
        // Replace this with your own logic to determine the value
        return 0;
    }

    public Integer showBug() {
        return asyncMethod();
    }
}