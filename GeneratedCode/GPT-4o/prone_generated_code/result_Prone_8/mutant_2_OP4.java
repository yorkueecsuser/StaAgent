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
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                // This block is unreachable
                System.out.println("This is an unreachable block.");
            } else {
                // This will throw a NullPointerException if input is null
                return future.thenApply(result -> {
                    System.out.println("Processing completed.");
                    return null;
                });
            }
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException due to null Future.");
            return CompletableFuture.completedFuture(null);
        }
    }

    private boolean getUnreachableCondition() {
        // This method always returns false
        return false;
    }

    public static void main(String[] args) {
        AsyncFunctionDemo demo = new AsyncFunctionDemo();
        demo.showBug(null);
    }
}