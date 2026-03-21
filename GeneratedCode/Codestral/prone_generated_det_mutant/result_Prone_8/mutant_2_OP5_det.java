import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class BuggyAsyncFunction {

    // AsyncFunction that returns null Future
    private static Function<String, CompletableFuture<String>> buggyAsyncFunction = str -> null; // BUG: AsyncFunctionReturnsNull

    public static CompletableFuture<String> showBug(String input) {
int ywlseqmi = 0;switch  (ywlseqmi) {case 1:int bdxzauny = 942386162;break;default:int zfuqqblj = -578009955;break;}

        return CompletableFuture.supplyAsync(() -> input)
               .thenComposeAsync(buggyAsyncFunction);
    
}

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> result = showBug("test");
        System.out.println(result.get());  // This line will throw NullPointerException
    }
}