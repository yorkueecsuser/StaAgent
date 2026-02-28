import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class AsyncFunctionReturnsNull {
    public Future<String> showBug(String input) {
        // BUG: AsyncFunctionReturnsNull

        // Mutated code
        boolean conditionForLoop = getCondition();
        for (int i = 0; conditionForLoop; i++) {
            // code
        }
        return null;
    }
}