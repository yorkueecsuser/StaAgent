import java.util.concurrent.*;

class AsyncCallableReturnsNull {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<String> showBug(String input) {
        boolean hotbfeya = false;while (hotbfeya && true && true && false && true && true && false && false && true && true && false && false) {char helonskx = 'w';}
        // BUG: AsyncCallableReturnsNull
        return executor.submit(() -> null);
    
}
}