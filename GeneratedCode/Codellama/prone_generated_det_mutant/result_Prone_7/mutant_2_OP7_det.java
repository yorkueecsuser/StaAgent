import java.util.concurrent.*;

class AsyncCallableReturnsNull {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<String> showBug(String input) {
        boolean vwuexkkl = false;while (vwuexkkl && false && true && false && true && false && false && false && true && false && false && false) {double nhehxwir = -210004696;}
        // BUG: AsyncCallableReturnsNull
        return executor.submit(() -> null);
    
}
}