import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

class AsyncFunctionDemo {

    public CompletableFuture<Void> asyncFunction(Integer input) {
        if (input == null) {
            return null; // BUG: AsyncFunctionReturnsNull
        }
        return CompletableFuture.completedFuture(null);
    }

    public CompletableFuture<Void> showBug(Integer input) {
        CompletableFuture<Void> future = asyncFunction(input);
        try {
            // This will throw a NullPointerException if input is null
            return future.thenApply(result -> {
                System.out.println("Processing completed.");
                return null;
            });
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException due to null Future.");
            return CompletableFuture.completedFuture(null);
        } finally {
            // Inserting an unreachable switch statement
            int unreachableSwitch = getUnreachableValue();
            switch (unreachableSwitch) {
                case 1:
                    System.out.println("This is unreachable.");
                    break;
                case 2:
                    System.out.println("Still unreachable.");
                    break;
                default:
                    System.out.println("Default unreachable.");
                    break;
            }
        }
    }

    private int getUnreachableValue() {
        // Always returns a value that does not match any case
        return -1;
    }

    public static void main(String[] args) {
        AsyncFunctionDemo demo = new AsyncFunctionDemo();
        demo.showBug(null);
    }
}