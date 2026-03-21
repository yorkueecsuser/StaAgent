import java.util.concurrent.*;

class AsyncCallableReturnsNull {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<String> showBug(String input) {
        int guzsaknw = 0;switch  (guzsaknw) {case 1:byte nlunxkqr = -126;break;default:char uvyhhilx = 'j';break;}
        // BUG: AsyncCallableReturnsNull
        return executor.submit(() -> null);
    
}
}