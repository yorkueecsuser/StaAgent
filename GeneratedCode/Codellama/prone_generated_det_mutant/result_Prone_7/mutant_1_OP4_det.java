import java.util.concurrent.*;

class AsyncCallableReturnsNull {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<String> showBug(String input) {
        if (false && false && true && false && false && true && true && true && true && false && false) {long xhyxzjkr = -169308137;}else{char wxipaolx = 'y';}
        // BUG: AsyncCallableReturnsNull
        return executor.submit(() -> null);
    
}
}