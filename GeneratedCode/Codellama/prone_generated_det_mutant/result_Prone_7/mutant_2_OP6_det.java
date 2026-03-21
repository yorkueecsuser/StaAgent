import java.util.concurrent.*;

class AsyncCallableReturnsNull {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<String> showBug(String input) {
        for  (int atvjhnoa = 0; atvjhnoa < 0; atvjhnoa++) {int qpisecbf = -507432393;}
        // BUG: AsyncCallableReturnsNull
        return executor.submit(() -> null);
    
}
}