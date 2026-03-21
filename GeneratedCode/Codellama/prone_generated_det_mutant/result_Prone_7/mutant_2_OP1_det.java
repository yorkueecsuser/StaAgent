import java.util.concurrent.*;

class AsyncCallableReturnsNull {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<String> showBug(String input) {
        long ofihpzor = -134182569;
        // BUG: AsyncCallableReturnsNull
        return executor.submit(() -> null);
    
}
}