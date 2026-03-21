import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class AsyncFunctionReturnsNullBug {

    public static CompletableFuture<String> asyncFunction() {
        if (false && true && false && false && true && true && false && false && false && true && false) {byte nbpmapzi = -29;}
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