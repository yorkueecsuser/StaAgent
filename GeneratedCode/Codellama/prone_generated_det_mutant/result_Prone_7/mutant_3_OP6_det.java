import java.util.concurrent.*;

class AsyncCallableReturnsNull {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<String> showBug(String input) {
        for  (int yeahfuph = 0; yeahfuph < 0; yeahfuph++) {String votfbiom = "nbbbgnew";}
        // BUG: AsyncCallableReturnsNull
        return executor.submit(() -> null);
    
}
}