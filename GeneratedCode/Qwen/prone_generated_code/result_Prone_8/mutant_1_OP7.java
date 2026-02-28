import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class AsyncFunctionReturnsNull {

    // Method to demonstrate the bug
    public CompletableFuture<String> showBug() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // Simulate some asynchronous operation
            return "Initial Result";
        });

        // Introduced unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
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