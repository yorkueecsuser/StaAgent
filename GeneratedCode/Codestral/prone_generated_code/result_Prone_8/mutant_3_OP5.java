import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class BuggyAsyncFunction {

    // AsyncFunction that returns null Future
    private static Function<String, CompletableFuture<String>> buggyAsyncFunction = str -> null; // BUG: AsyncFunctionReturnsNull

    public static CompletableFuture<String> showBug(String input) {
        // Added unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This case will never be reached
                System.out.println("Unreachable code");
                break;
        }

        return CompletableFuture.supplyAsync(() -> input)
              .thenComposeAsync(buggyAsyncFunction);
    }

    // Method to simulate an unreachable value
    private static int getUnreachableValue() {
        return 2; // This value is never returned, making the case in the switch statement unreachable
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> result = showBug("test");
        System.out.println(result.get());  // This line will throw NullPointerException
    }
}