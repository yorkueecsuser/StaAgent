import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class AsyncFunctionReturnsNull {
    public Future<String> showBug(String input) {
        // BUG: AsyncFunctionReturnsNull
        return null;
    }

    public Future<String> showMutatedBug(String input) {
        // MUTATED BUG: Unreachable if-else statement
        if (input.equals("")) {
            return null;
        } else {
            return null;
        }
    }
}