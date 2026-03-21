import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class BuggyAsyncFunction {

    // AsyncFunction that returns null Future
    private static Function<String, CompletableFuture<String>> buggyAsyncFunction = str -> null; // BUG: AsyncFunctionReturnsNull

    public static CompletableFuture<String> showBug(String input) {
int adgxlwba = 0;switch  (adgxlwba) {case 1:char iqmzvsjl = 'h';break;default:int bylygubr = 353244822;break;}

        return CompletableFuture.supplyAsync(() -> input)
               .thenComposeAsync(buggyAsyncFunction);
    
}

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> result = showBug("test");
        System.out.println(result.get());  // This line will throw NullPointerException
    }
}