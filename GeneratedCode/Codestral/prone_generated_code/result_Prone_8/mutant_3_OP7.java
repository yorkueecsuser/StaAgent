import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class BuggyAsyncFunction {

    // AsyncFunction that returns null Future
    private static Function<String, CompletableFuture<String>> buggyAsyncFunction = str -> {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable since getCondition() always returns false
        }
        return null;
    }; // BUG: AsyncFunctionReturnsNull

    private static boolean getCondition() {
        return false;
    }

    public static CompletableFuture<String> showBug(String input) {
        return CompletableFuture.supplyAsync(() -> input)
              .thenComposeAsync(buggyAsyncFunction);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> result = showBug("test");
        System.out.println(result.get());  // This line will throw NullPointerException
    }
}