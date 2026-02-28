import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class AsyncMethodBug {

    // BUG: Async methods should return void or Future
    public String asyncMethod() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Result"; // This line contains the bug
    }

    public String showBug() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(this::asyncMethod);
        return future.get();
    }

    public static void main(String[] args) {
        AsyncMethodBug bugDemo = new AsyncMethodBug();
        try {
            System.out.println(bugDemo.showBug());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}