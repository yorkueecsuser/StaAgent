import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

class BuggyAsyncCallable {

    // Mutated method starts here
    private static boolean getFalseCondition() {
        return false;
    }

    public static CompletableFuture<String> buggyAsyncCallable() {
        return CompletableFuture.completedFuture(null);
    }

    public static String showBug() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                // Unreachable for loop starts here
                for (int i = 0; getFalseCondition(); i++) {
                    // This loop is unreachable
                }
                // Unreachable for loop ends here
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