import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class BuggyAsyncFunction {

    // AsyncFunction that returns null Future
    private static Function<String, CompletableFuture<String>> buggyAsyncFunction = str -> null; // BUG: AsyncFunctionReturnsNull

    private static boolean alwaysFalse() {
        return false;
    }

    public static CompletableFuture<String> showBug(String input) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> input);

        // Mutated code: Unreachable if-else statement
        if (alwaysFalse()) {
            // Unreachable block
            System.out.println("This code will never execute.");
            future = future.thenCompose(s -> null);
        } else {
            // Original block
            future = future.thenComposeAsync(buggyAsyncFunction);
        }

        return future;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> result = showBug("test");
        System.out.println(result.get());  // This line will throw NullPointerException
    }
}