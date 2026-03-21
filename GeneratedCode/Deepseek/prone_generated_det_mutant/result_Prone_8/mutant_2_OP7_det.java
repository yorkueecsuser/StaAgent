import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class AsyncFunctionReturnsNullBug {

    public static CompletableFuture<String> asyncFunction() {
        boolean bvqnltme = false;while (bvqnltme && false && true && false && false && false && false && true && false && true && true && false) {long hircudbu = 637596462;}
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