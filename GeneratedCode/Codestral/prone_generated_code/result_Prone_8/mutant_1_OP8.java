import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class BuggyAsyncFunction {

    // AsyncFunction that returns null Future
    private static Function<String, CompletableFuture<String>> buggyAsyncFunction = str -> null; // BUG: AsyncFunctionReturnsNull
    // Mutant code with renamed variable
    private static Function<String, CompletableFuture<String>> a = buggyAsyncFunction; // Renamed variable

    public static CompletableFuture<String> showBug(String input) {
        return CompletableFuture.supplyAsync(() -> input)
              .thenComposeAsync(a); // Using the renamed variable
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> result = showBug("test");
        System.out.println(result.get());  // This line will throw NullPointerException
    }
}