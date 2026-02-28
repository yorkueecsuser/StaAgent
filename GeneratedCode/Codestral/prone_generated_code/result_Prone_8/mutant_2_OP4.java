import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class BuggyAsyncFunction {

    // AsyncFunction that returns null Future
    private static Function<String, CompletableFuture<String>> buggyAsyncFunction = str -> null;

    // Method to simulate a false condition
    private static boolean unreachableCondition() {
        return false;
    }

    public static CompletableFuture<String> showBug(String input) {
        if (unreachableCondition()) {
            // Unreachable if-else statement
            System.out.println("This statement should never be executed.");
        } else {
            return CompletableFuture.supplyAsync(() -> input)
                  .thenComposeAsync(buggyAsyncFunction);
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> result = showBug("test");
        System.out.println(result.get());  // This line will throw NullPointerException
    }
}