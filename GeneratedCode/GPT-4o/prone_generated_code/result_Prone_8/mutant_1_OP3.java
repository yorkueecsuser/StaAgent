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
            // Unreachable if statement added
            boolean condition = getFalseCondition();
            if (condition) {
                System.out.println("This is an unreachable code block.");
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

    // Helper method to simulate a non-final variable for unreachable condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        AsyncFunctionDemo demo = new AsyncFunctionDemo();
        demo.showBug(null);
    }
}