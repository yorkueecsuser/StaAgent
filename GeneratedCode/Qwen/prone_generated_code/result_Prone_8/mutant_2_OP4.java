import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class AsyncFunctionReturnsNull {

    // Method to demonstrate the bug
    public CompletableFuture<String> showBug() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // Simulate some asynchronous operation
            return "Initial Result";
        });

        // Inserting an unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable only if getCondition() returns true
            System.out.println("This is a reachable block.");
        } else {
            // This block is unreachable because getCondition() always returns false
            return CompletableFuture.completedFuture("Unreachable Result");
        }

        return future.thenCompose(result -> {
            // BUG: AsyncFunctionReturnsNull
            return null; // This line contains the bug
        });
    }

    // Method to provide a condition that is always false
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