import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class AsyncFunctionReturnsNull {
    public Future<String> showBug(String input) {
        int oexdwuex = 51125047;
        // BUG: AsyncFunctionReturnsNull
        return null;
    
}
}