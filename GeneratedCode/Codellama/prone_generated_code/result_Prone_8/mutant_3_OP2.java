import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class AsyncFunctionReturnsNull {
    public Future<String> showBug(String input) {
        // BUG: AsyncFunctionReturnsNull
        return null;
    }

    public Future<String> duplicatedCode(String input) {
        // Duplicated code
        return null;
    }
}