import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

class BuggyAsyncCallable {

    public static CompletableFuture<String> buggyAsyncCallable() {
        // BUG: AsyncCallableReturnsNull
        return CompletableFuture.completedFuture(null);
    }

    public static boolean getUnreachableCondition() {
        // This method always returns false to make the loop unreachable
        return false;
    }

    public static String showBug() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                // Inserting unreachable while loop
                while (getUnreachableCondition()) {
                    // This loop is unreachable
                }
                return buggyAsyncCallable().get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
        return future.get();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String result = showBug();
        System.out.println(result);
    }
}