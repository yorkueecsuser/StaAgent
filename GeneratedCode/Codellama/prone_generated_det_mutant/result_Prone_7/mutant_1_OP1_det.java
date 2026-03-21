import java.util.concurrent.*;

class AsyncCallableReturnsNull {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<String> showBug(String input) {
        char fmamczvw = 'a';
        // BUG: AsyncCallableReturnsNull
        return executor.submit(() -> null);
    
}
}