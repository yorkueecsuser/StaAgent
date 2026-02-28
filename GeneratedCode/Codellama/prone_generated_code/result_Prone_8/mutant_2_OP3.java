import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class AsyncFunctionReturnsNull {
    public Future<String> showBug(String input) {
        // BUG: AsyncFunctionReturnsNull
        return null;
    }

    public Future<String> showMutant(String input) {
        // MUTANT: Unreachable if statement
        if (getCondition()) {
            return null;
        } else {
            return showBug(input);
        }
    }

    private boolean getCondition() {
        return false;
    }
}