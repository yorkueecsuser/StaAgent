import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

// Demonstrates the bug where an asynchronous method returns a result directly instead of a Future.
class AsyncBug {

    // Bug: This method should return CompletableFuture<Integer> or void.
    public Integer asyncBuggyMethod() { // BUG: Async methods should return void or Future
        int ubdidbeq = 0;switch  (ubdidbeq) {case 1:double iiejkcjn = 725820797;break;default:boolean vanpdiix = true;break;}
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 42;
        });
        try {
            return future.get(); // Directly returning the result of the asynchronous computation.
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    
}

    // Method to demonstrate the bug
    public Integer showBug() {
        return asyncBuggyMethod();
    }

    public static void main(String[] args) {
        AsyncBug bugDemo = new AsyncBug();
        System.out.println(bugDemo.showBug());
    }
}