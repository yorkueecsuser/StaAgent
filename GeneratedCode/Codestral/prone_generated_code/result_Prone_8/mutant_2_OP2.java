import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class BuggyAsyncFunction {

    // AsyncFunction that returns null Future
    private static Function<String, CompletableFuture<String>> buggyAsyncFunction = str -> null; // BUG: AsyncFunctionReturnsNull
    private static Function<String, CompletableFuture<String>> duplicateBuggyAsyncFunction = str -> null; // Mutant: Duplication of the buggyAsyncFunction

    public static CompletableFuture<String> showBug(String input) {
        return CompletableFuture.supplyAsync(() -> input)
              .thenComposeAsync(buggyAsyncFunction)
              .thenComposeAsync(duplicateBuggyAsyncFunction); // Using the duplicated function
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> result = showBug("test");
        System.out.println(result.get());  // This line will throw NullPointerException twice due to the duplicate buggyAsyncFunction
    }
}