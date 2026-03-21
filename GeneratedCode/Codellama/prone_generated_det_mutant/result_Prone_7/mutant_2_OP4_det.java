import java.util.concurrent.*;

class AsyncCallableReturnsNull {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<String> showBug(String input) {
        if (true && true && true && true && true && false && false && true && false && true && false) {long ehheqnrb = 187591385;}else{int csakhsac = 218156692;}
        // BUG: AsyncCallableReturnsNull
        return executor.submit(() -> null);
    
}
}