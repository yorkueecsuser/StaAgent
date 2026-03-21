import java.util.concurrent.*;

class AsyncCallableReturnsNull {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<String> showBug(String input) {
        boolean sncbtlmz = false;while (sncbtlmz && false && true && false && false && false && true && true && false && true && false && false) {boolean aeflzfdm = true;}
        // BUG: AsyncCallableReturnsNull
        return executor.submit(() -> null);
    
}
}