import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class BuggyAsyncFunctionMutant {

    // AsyncFunction that returns null Future
    private static Function<String, CompletableFuture<String>> buggyAsyncFunction = str -> null; // BUG: AsyncFunctionReturnsNull

    private static boolean getUnreachableCondition() {
        return false;
    }

    public static CompletableFuture<String> showBug(String input) {
        if (getUnreachableCondition()) {
            // This if statement is unreachable, added as per the mutation operator
            throw new RuntimeException("Unreachable code has been executed");
        }

        return CompletableFuture.supplyAsync(() -> input)
              .thenComposeAsync(buggyAsyncFunction);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> result = showBug("test");
        System.out.println(result.get());  // This line will throw NullPointerException
    }
}