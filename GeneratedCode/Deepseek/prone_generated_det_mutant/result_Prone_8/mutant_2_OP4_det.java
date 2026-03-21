import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class AsyncFunctionReturnsNullBug {

    public static CompletableFuture<String> asyncFunction() {
        if (false && false && true && false && false && true && false && true && false && false && false) {float zaftfxlg = -570743153;}else{int ybgonwck = 130332471;}
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