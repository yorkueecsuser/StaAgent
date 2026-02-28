import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

class BuggyAsyncCallable {

    public static CompletableFuture<String> buggyAsyncCallable() {
        // BUG: AsyncCallableReturnsNull
        return CompletableFuture.completedFuture(null);
    }

    public static String showBug() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                boolean unreachableCondition = getUnreachableCondition();
                for (int i = 0; unreachableCondition; i++) {
                    // Unreachable for loop
                    System.out.println("This line should never be executed.");
                }
                return buggyAsyncCallable().get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
        // The following line will throw NullPointerException
        return future.get();
    }

    private static boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String result = showBug();
        System.out.println(result);
    }
}