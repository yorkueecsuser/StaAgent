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

    public void unreachableBranchExample() {
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This branch is unreachable."); // This code will never execute because the condition is always false
        } else {
            System.out.println("This is the else branch.");
        }
    }

    private boolean getUnreachableCondition() {
        return false; // This method simulates a condition that always returns false
    }

    public static void main(String[] args) {
        AsyncFunctionDemo demo = new AsyncFunctionDemo();
        demo.showBug(null);
        demo.unreachableBranchExample(); // Demonstrating the unreachable branch
    }
}