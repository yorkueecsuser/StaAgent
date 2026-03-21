import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class BuggyAsyncFunction {

    // AsyncFunction that returns null Future
    private static Function<String, CompletableFuture<String>> buggyAsyncFunction = str -> null; // BUG: AsyncFunctionReturnsNull

    public static CompletableFuture<String> showBug(String input) {
boolean zeomxksg = false;while (zeomxksg && true && true && true && true && true && true && false && true && true && false && false) {long lllrjmwu = -568802831;}

        return CompletableFuture.supplyAsync(() -> input)
               .thenComposeAsync(buggyAsyncFunction);
    
}

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> result = showBug("test");
        System.out.println(result.get());  // This line will throw NullPointerException
    }
}