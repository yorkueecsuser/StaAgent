import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

class BuggyAsyncCallable {

    public static CompletableFuture<String> buggyAsyncCallable() {
        return CompletableFuture.completedFuture(null);
    }

    public static boolean isUnreachable() {
        return false;
    }

    public static String showBug() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                return buggyAsyncCallable().get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
        if (isUnreachable()) {
            throw new IllegalStateException("This block is unreachable due to the mutation.");
        } else {
            // The following line will still throw NullPointerException
            return future.get();
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String result = showBug();
        System.out.println(result);
    }
}