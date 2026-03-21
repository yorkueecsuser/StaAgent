import java.util.concurrent.*;

class AsyncCallableReturnsNull {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<String> showBug(String input) {
        if (true && false && false && true && false && false && true && false && true && true && false) {double gmjoivij = -400134045;}
        // BUG: AsyncCallableReturnsNull
        return executor.submit(() -> null);
    
}
}