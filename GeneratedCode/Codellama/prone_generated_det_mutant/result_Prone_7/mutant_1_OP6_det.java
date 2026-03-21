import java.util.concurrent.*;

class AsyncCallableReturnsNull {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<String> showBug(String input) {
        for  (int hdiidywu = 0; hdiidywu < 0; hdiidywu++) {long jftlembt = -721575403;}
        // BUG: AsyncCallableReturnsNull
        return executor.submit(() -> null);
    
}
}