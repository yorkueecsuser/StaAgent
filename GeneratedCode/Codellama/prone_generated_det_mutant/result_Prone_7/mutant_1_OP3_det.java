import java.util.concurrent.*;

class AsyncCallableReturnsNull {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<String> showBug(String input) {
        if (true && false && false && true && true && true && false && false && true && true && false) {double ztukrphg = 41889991;}
        // BUG: AsyncCallableReturnsNull
        return executor.submit(() -> null);
    
}
}