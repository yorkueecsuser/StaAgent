import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class AsyncFunctionReturnsNull {

    // Method to demonstrate the bug
    public CompletableFuture<String> showBug() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // Simulate some asynchronous operation
            return "Initial Result";
        });

        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // This branch is unreachable because getCondition() always returns false
            return CompletableFuture.completedFuture("Unreachable Result");
        }

        return future.thenCompose(result -> {
            // BUG: AsyncFunctionReturnsNull
            return null; // This line contains the bug
        });
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
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