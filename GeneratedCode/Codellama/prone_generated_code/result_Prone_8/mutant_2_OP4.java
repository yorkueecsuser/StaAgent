import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class AsyncFunctionReturnsNull {
    public Future<String> showBug(String input) {
        // BUG: AsyncFunctionReturnsNull
        if (getCondition()) {
            return null;
        } else {
            return null;
        }
    }
}