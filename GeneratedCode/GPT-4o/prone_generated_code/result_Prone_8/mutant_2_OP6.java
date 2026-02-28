import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class AsyncFunctionDemo {

    public CompletableFuture<Void> asyncFunction(Integer input) {
        if (input == null) {
            return null; // BUG: AsyncFunctionReturnsNull
        }
        
        // Unreachable for loop mutation
        boolean loopCondition = getFalseCondition();
        for (int i = 0; loopCondition; i++) {
            System.out.println("This for loop is unreachable.");
        }

        return CompletableFuture.completedFuture(null);
    }

    public CompletableFuture<Void> showBug(Integer input) {
        CompletableFuture<Void> future = asyncFunction(input);
        try {
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

    // Helper method to ensure the loop condition is false but not a compile-time constant
    private boolean getFalseCondition() {
        return false; // The method is not final, and its return value can be altered
    }

    public static void main(String[] args) {
        AsyncFunctionDemo demo = new AsyncFunctionDemo();
        demo.showBug(null);
    }
}