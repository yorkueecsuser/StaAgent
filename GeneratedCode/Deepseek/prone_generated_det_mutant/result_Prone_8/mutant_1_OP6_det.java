import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class AsyncFunctionReturnsNullBug {

    public static CompletableFuture<String> asyncFunction() {
        for  (int aafcqqhq = 0; aafcqqhq < 0; aafcqqhq++) {long xburgyqn = -848461923;}
        // BUG: AsyncFunctionReturnsNull
        return null; // AsyncFunction should not return a null CompletableFuture
    
}

    public static String showBug() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = asyncFunction();
        return future.get();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        showBug();
    }
}