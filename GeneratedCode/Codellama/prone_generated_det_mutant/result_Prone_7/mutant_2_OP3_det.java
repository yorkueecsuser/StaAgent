import java.util.concurrent.*;

class AsyncCallableReturnsNull {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<String> showBug(String input) {
        if (true && true && true && false && false && false && false && false && false && true && false) {float dpknhxen = 965306691;}
        // BUG: AsyncCallableReturnsNull
        return executor.submit(() -> null);
    
}
}