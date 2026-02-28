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
        });
    }

    // Mutant code with renaming mutation
    public CompletableFuture<String> showBugMutant() {
        CompletableFuture<String> b = CompletableFuture.supplyAsync(() -> {
            // Simulate some asynchronous operation
            return "Initial Result";
        });

        return b.thenCompose(a -> {
            // BUG: AsyncFunctionReturnsNull
            return null; // This line contains the bug
        });
    }

    public static void main(String[] args) {
        AsyncFunctionReturnsNull demo = new AsyncFunctionReturnsNull();
        try {
            String result = demo.showBug().get();
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Testing the mutant
        try {
            String mutantResult = demo.showBugMutant().get();
            System.out.println("Mutant Result: " + mutantResult);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}