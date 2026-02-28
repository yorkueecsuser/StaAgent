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

            // Inserting unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // Unreachable code
                System.out.println("This is an unreachable loop");
            }
        });
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This will always return false, making the loop unreachable
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