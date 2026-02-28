import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class BuggyAsyncFunction {

    private static Function<String, CompletableFuture<String>> buggyAsyncFunction = str -> null;

    public static CompletableFuture<String> showBug(String input) {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // unreachable code
            System.out.println("This code will never execute.");
        }
        return CompletableFuture.supplyAsync(() -> input)
              .thenComposeAsync(buggyAsyncFunction);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> result = showBug("test");
        System.out.println(result.get());
    }
}