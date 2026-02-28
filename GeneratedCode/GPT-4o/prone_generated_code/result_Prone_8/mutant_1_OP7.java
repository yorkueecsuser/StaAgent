import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class AsyncFunctionDemo {

    public CompletableFuture<Void> asyncFunction(Integer input) {
        if (input == null) {
            return null; // BUG: AsyncFunctionReturnsNull
        }
        return CompletableFuture.completedFuture(null);
    }

    public CompletableFuture<Void> showBug(Integer input) {
        CompletableFuture<Void> future = asyncFunction(input);
        try {
            // Mutation: Unreachable while loop
            boolean conditionWhile = getConditionWhile();
            while (conditionWhile) {
                // This is unreachable code block
                System.out.println("This loop is unreachable.");
            }
            // This will throw a NullPointerException if input is null
            return future.thenApply(result -> {
                System.out.println("Processing completed.");
                return null;
            });
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException due to null Future.");
            return CompletableFuture.completedFuture(null);
        }
    }

    private boolean getConditionWhile() {
        return false; // Ensures the while loop is never entered
    }

    public static void main(String[] args) {
        AsyncFunctionDemo demo = new AsyncFunctionDemo();
        demo.showBug(null);
    }
}