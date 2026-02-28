import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

class BuggyAsyncCallable {

    public static CompletableFuture<String> buggyAsyncCallable() {
        return CompletableFuture.completedFuture(null);
    }

    private static boolean getUnreachableCondition() {
        return false;
    }

    public static String showBug() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                String result = buggyAsyncCallable().get();
                // Mutant: Unreachable switch statement
                switch(getUnreachableCondition()) {
                    case true:
                        System.out.println("This will never be printed.");
                        break;
                }
                return result;
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