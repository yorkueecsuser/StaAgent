import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

class BuggyAsyncCallable {

    private static boolean getUnreachableCondition() {
        return false;
    }

    public static CompletableFuture<String> buggyAsyncCallable() {
        if (getUnreachableCondition()) {
            System.out.println("This line is unreachable");
        }
        return CompletableFuture.completedFuture(null);
    }

    public static String showBug() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                if (getUnreachableCondition()) {
                    System.out.println("This line is unreachable");
                }
                return buggyAsyncCallable().get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
        if (getUnreachableCondition()) {
            System.out.println("This line is unreachable");
        }
        // The following line will throw NullPointerException
        return future.get();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String result = showBug();
        System.out.println(result);
    }
}