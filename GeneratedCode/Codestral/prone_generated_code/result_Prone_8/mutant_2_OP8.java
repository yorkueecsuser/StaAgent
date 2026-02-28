import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class BuggyAsyncFunction {

    // Original code
    private static Function<String, CompletableFuture<String>> buggyAsyncFunction = str -> null;

    // Mutant code using Renaming mutation operator
    private static Function<String, CompletableFuture<String>> m_buggyAsyncFunction = str -> CompletableFuture.completedFuture(str);

    public static CompletableFuture<String> showBug(String input) {
        return CompletableFuture.supplyAsync(() -> input)
              .thenComposeAsync(buggyAsyncFunction);
    }

    public static CompletableFuture<String> showMutant(String input) {
        return CompletableFuture.supplyAsync(() -> input)
              .thenComposeAsync(m_buggyAsyncFunction);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> result = showBug("test");
        System.out.println(result.get());  // This line will throw NullPointerException

        // Testing the mutant code
        CompletableFuture<String> mutantResult = showMutant("test");
        System.out.println(mutantResult.get());  // This line will print "test"
    }
}