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

            // Mutant code: Unreachable if-else statement
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                // This code is unreachable
                System.out.println("Unreachable code executed");
            } else {
                // This is the else branch of the unreachable if-else statement
                // This code is also unreachable
                System.out.println("This is the else branch of the unreachable if-else statement");
            }

            return 10;
        });
        try {
            return future.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    // Method to return a false condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public Integer showBug() {
        return asyncMethod();
    }
}