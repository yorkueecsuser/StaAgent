import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class BuggyAsyncFunction {

    private static Function<String, CompletableFuture<String>> buggyAsyncFunction = str -> {
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // Unreachable loop
        }
        return null;
    };

    public static CompletableFuture<String> showBug(String input) {
        return CompletableFuture.supplyAsync(() -> input)
              .thenComposeAsync(buggyAsyncFunction);
    }

    private static boolean getUnreachableCondition() {
        return false;  // Always returns false, making the loop unreachable
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> result = showBug("test");
        System.out.println(result.get());  // This line will throw NullPointerException
    }
}