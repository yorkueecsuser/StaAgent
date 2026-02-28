import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class BuggyAsyncFunction {

    // AsyncFunction that returns null Future
    private static Function<String, CompletableFuture<String>> buggyAsyncFunction = str -> null; // BUG: AsyncFunctionReturnsNull

    // Mutant: Renamed buggyAsyncFunction to r
    private static Function<String, CompletableFuture<String>> r = str -> null;

    public static CompletableFuture<String> showBug(String input) {
        return CompletableFuture.supplyAsync(() -> input)
              .thenComposeAsync(r); // Using the renamed variable in this line
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> result = showBug("test");
        System.out.println(result.get());  // This line will still throw NullPointerException
    }
}