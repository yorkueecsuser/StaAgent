import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class AsyncFunctionReturnsNull {
    public Future<String> showBug(String input) {
        // BUG: AsyncFunctionReturnsNull
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Reachable branch");
        } else {
            System.out.println("Unreachable branch");
        }
        return null;
    }

    private boolean getCondition() {
        // This method is used to get a non-final variable or an equivalent method call
        // to make the condition of the inserted branch always false to make it unreachable.
        return false;
    }
}