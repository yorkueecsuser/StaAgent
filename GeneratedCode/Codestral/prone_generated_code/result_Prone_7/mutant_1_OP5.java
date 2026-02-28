import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

class BuggyAsyncCallable {

    public static CompletableFuture<String> buggyAsyncCallable() {
        // BUG: AsyncCallableReturnsNull
        return CompletableFuture.completedFuture(null);
    }

    // Mutation Operator: Unreachable switch statement
    private static boolean getUnreachableCondition() {
        return false;
    }

    public static String showBug() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                String result = buggyAsyncCallable().get();
                // Inserted unreachable switch statement
                if (getUnreachableCondition()) {
                    switch (result) {
                        case "unreachable":
                            System.out.println("This statement is unreachable");
                            break;
                    }
                }
                return result;
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
        // The following line will throw NullPointerException
        return future.get();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String result = showBug();
        System.out.println(result);
    }
}