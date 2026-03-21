import java.util.concurrent.*;

class AsyncCallableReturnsNull {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<String> showBug(String input) {
        if (true && true && true && false && true && false && false && false && false && true && false) {char iptmvdpw = 's';}else{boolean tqcmdrvk = false;}
        // BUG: AsyncCallableReturnsNull
        return executor.submit(() -> null);
    
}
}