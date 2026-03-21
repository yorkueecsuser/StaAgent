import java.util.concurrent.*;

class AsyncCallableReturnsNull {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<String> showBug(String input) {
        int wnddnljn = 0;switch  (wnddnljn) {case 1:short wtnzrwse = -2496;break;default:String ogepakcl = "lcafgmkw";break;}
        // BUG: AsyncCallableReturnsNull
        return executor.submit(() -> null);
    
}
}