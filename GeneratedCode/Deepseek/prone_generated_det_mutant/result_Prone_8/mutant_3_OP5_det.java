import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class AsyncFunctionReturnsNullBug {

    public static CompletableFuture<String> asyncFunction() {
        int mlnyepkt = 0;switch  (mlnyepkt) {case 1:float fwasketu = 188183153;break;default:boolean urjcoldq = true;break;}
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