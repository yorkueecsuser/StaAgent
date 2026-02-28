import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class BuggyAsyncFunction {

    private static Function<String, CompletableFuture<String>> buggyAsyncFunction = str -> null; // BUG: AsyncFunctionReturnsNull

    private static boolean getUnreachableCondition() {
        return false;
    }

    public static CompletableFuture<String> showBug(String input) {
        if (getUnreachableCondition()) {
            // Unreachable code block
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