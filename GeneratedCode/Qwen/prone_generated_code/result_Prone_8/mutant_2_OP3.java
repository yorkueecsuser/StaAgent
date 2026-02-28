import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class AsyncFunctionReturnsNull {

    // Method to demonstrate the bug
    public CompletableFuture<String> showBug() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // Simulate some asynchronous operation
            return "Initial Result";
        });

        return future.thenCompose(result -> {
            // BUG: AsyncFunctionReturnsNull
            return null; // This line contains the bug

            // Inserting unreachable if branch
            boolean condition = getCondition();
            if (condition) {
                // Unreachable code
                return CompletableFuture.completedFuture("Unreachable Result");
            }
        });
    }

    private boolean getCondition() {
        // This method returns a condition that is always false at runtime
        return false;
    }

    public static void main(String[] args) {
        AsyncFunctionReturnsNull demo = new AsyncFunctionReturnsNull();
        try {
            String result = demo.showBug().get();
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}