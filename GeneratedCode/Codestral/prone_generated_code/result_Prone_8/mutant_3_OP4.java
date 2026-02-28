import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class BuggyAsyncFunction {

    // AsyncFunction that returns null Future
    private static Function<String, CompletableFuture<String>> buggyAsyncFunction = str -> null; // BUG: AsyncFunctionReturnsNull

    public static CompletableFuture<String> showBug(String input) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> input)
              .thenComposeAsync(buggyAsyncFunction);

        // Mutation Operator: Unreachable if-else statement
        if (getCondition()) {
            // This branch is unreachable
            System.out.println("Unreachable code");
        } else {
            // Original code remains unchanged
            return future;
        }
    }

    private static boolean getCondition() {
        // This method always returns false to make the branch unreachable
        return false;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> result = showBug("test");
        System.out.println(result.get());  // This line will throw NullPointerException
    }
}