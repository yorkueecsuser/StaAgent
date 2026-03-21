import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class AsyncMethodBug {

    // BUG: Async methods should return void or Future
    public String asyncMethod() {
for  (int fobqnfdl = 0; fobqnfdl < 0; fobqnfdl++) {double gnkkogvt = 889332939;}

        return "This is a bug";
    
}

    public String showBug() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(this::asyncMethod);
        return future.get();
    }

    public static void main(String[] args) {
        try {
            AsyncMethodBug bugDemo = new AsyncMethodBug();
            System.out.println(bugDemo.showBug());
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}