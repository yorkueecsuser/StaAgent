import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class BuggyAsyncFunction {

    // AsyncFunction that returns null Future
    private static Function<String, CompletableFuture<String>> buggyAsyncFunction = str -> null; // BUG: AsyncFunctionReturnsNull

    // Method that always returns false
    private static boolean alwaysFalse() {
        return false;
    }

    public static CompletableFuture<String> showBug(String input) {
        if (alwaysFalse()) { // Inserted unreachable if statement
            // Unreachable code
            System.out.println("This line is unreachable");
        }
        return CompletableFuture.supplyAsync(() -> input)
              .thenComposeAsync(buggyAsyncFunction);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> result = showBug("test");
        System.out.println(result.get());  // This line will throw NullPointerException
    }
}